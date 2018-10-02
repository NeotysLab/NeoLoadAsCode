package com.neotys.testing.framework;

import com.neotys.neoload.model.core.Element;
import com.neotys.neoload.model.repository.*;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hrexed on 04/07/18.
 */
public abstract class BaseNeoLoadUserPath {

	private static final AtomicInteger DELAY_COUNTER = new AtomicInteger(0);
	private static final AtomicInteger THINK_TIME_COUNTER = new AtomicInteger(0);

	private final UserPath virtualUser;

	public BaseNeoLoadUserPath(final BaseNeoLoadDesign design) {
		virtualUser = createVirtualUser(design);
	}

	protected static ImmutableContainer endContainer() {
		return ImmutableContainer.builder().name("End").build();
	}

	protected static ImmutableContainer initContainer() {
		return ImmutableContainer.builder().name("Init").build();
	}

	protected static ImmutableContainer.Builder actionsContainerBuilder() {
		return ImmutableContainer.builder().name("Actions");
	}

	protected static Parameter parameter(final String parameterName, final String parameterValue) {
		return ImmutableParameter.builder()
				.name(parameterName)
				.value(parameterValue)
				.build();
	}
	protected static RegexpValidator regexpValidator(final String validatorname,final String regexp,boolean hastocontain)
	{
		return ImmutableRegexpValidator.builder()
				.name(validatorname)
				.haveToContains(hastocontain)
				.validationRegex(regexp)
				.build();
	}
	protected static Header header(final String headerName,final String headervalue)
	{
		return ImmutableHeader.builder()
				.headerName(headerName)
				.headerValue(headervalue)
				.build();
	}
	protected static VariableExtractor extractor(final String variableExtractorName, final String regexp,int occurence, boolean exitonerror) {
		return ImmutableVariableExtractor.builder()
				.name(variableExtractorName)
				.regExp(regexp)
				.nbOccur(occurence)
				.exitOnError(exitonerror)
				.build();

	}
	protected static Delay delay(final long duration) {
		return delay(duration, "delay_" + DELAY_COUNTER.incrementAndGet(), false);
	}

	protected static Delay thinkTime(final long duration) {
		return delay(duration, "think_time_" + THINK_TIME_COUNTER.incrementAndGet(), true);
	}

	private static Delay delay(final long duration, final String name, final boolean isThinkTime) {
		return ImmutableDelay.builder()
				.name(name)
				.isThinkTime(isThinkTime)
				.delay(String.valueOf(duration))
				.build();
	}

	protected static String variabilize(final Variable var) {
		return variabilize(var.getName());
	}

	protected static String variabilize(final String variableName) {
		return "${" + variableName + "}";
	}

	protected static ImmutableUserPath.Builder userPathBuilder(final String name) {
		return ImmutableUserPath.builder()
				.name(name)
				.initContainer(initContainer())
				.endContainer(endContainer());
	}


	protected static ImmutablePostFormRequest.Builder postFormBuilder(final Server server, final String path, final Collection<Parameter> parameters, final Collection<Parameter> postParameters,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutablePostFormRequest.builder()
				.name(path)
				.path(path)
				.server(server)
				.httpMethod(Request.HttpMethod.POST)
				.addAllPostParameters(postParameters)
				.addAllParameters(parameters)
				.addAllExtractors(extractors)
				.addAllValidators(validators);
	}

	protected static ImmutablePostFormRequest.Builder postFormBuilderWithHeaders(final Server server,final Collection<Header> headers, final String path, final Collection<Parameter> parameters, final Collection<Parameter> postParameters,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutablePostFormRequest.builder()
				.name(path)
				.path(path)
				.server(server)
				.httpMethod(Request.HttpMethod.POST)
				.addAllPostParameters(postParameters)
				.addAllParameters(parameters)
				.addAllExtractors(extractors)
				.addAllValidators(validators)
				.addAllHeaders(headers);
	}

	protected static ImmutablePostTextRequest.Builder postTextBuilder(final Server server, final String path, final String data,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutablePostTextRequest.builder()
				.name(path)
				.path(path)
				.server(server)
				.httpMethod(Request.HttpMethod.POST)
				.data(data)
				.addAllExtractors(extractors)
				.addAllValidators(validators);
	}

	protected static ImmutablePostTextRequest.Builder postTextBuilderWithHeaders(final Server server,final Collection<Header> headers, final String path, final String data,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutablePostTextRequest.builder()
				.name(path)
				.path(path)
				.server(server)
				.httpMethod(Request.HttpMethod.POST)
				.data(data)
				.addAllExtractors(extractors)
				.addAllHeaders(headers)
				.addAllValidators(validators);
	}

	protected static ImmutableGetPlainRequest.Builder getBuilder(final Server server, final String path, final Collection<Parameter> parameters,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutableGetPlainRequest.builder()
				.server(server)
				.name(path)
				.path(path)
				.httpMethod(Request.HttpMethod.GET)
				.addAllParameters(parameters)
				.addAllExtractors(extractors)
				.addAllValidators(validators);
	}
	protected static ImmutableGetPlainRequest.Builder getBuilderWithHeaders(final Server server,final Collection<Header> headers, final String path, final Collection<Parameter> parameters,final Collection<VariableExtractor> extractors, final Collection<RegexpValidator> validators) {
		return ImmutableGetPlainRequest.builder()
				.server(server)
				.name(path)
				.path(path)
				.httpMethod(Request.HttpMethod.GET)
				.addAllParameters(parameters)
				.addAllExtractors(extractors)
				.addAllHeaders(headers)
				.addAllValidators(validators);
	}
	protected static Container container(final String name, final Collection<Element> children) {
		return ImmutableContainer.builder()
				.name(name)
				.addAllChilds(children)
				.build();
	}

	protected static Container container(final String name, final Element... children) {
		return ImmutableContainer.builder()
				.name(name)
				.addChilds(children)
				.build();
	}

	public UserPath getVirtualUser() {
		return virtualUser;
	}

	public abstract UserPath createVirtualUser(final BaseNeoLoadDesign design);

	public String getName() {
		return virtualUser.getName();
	}

}
