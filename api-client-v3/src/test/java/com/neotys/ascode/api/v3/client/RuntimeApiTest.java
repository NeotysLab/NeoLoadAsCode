/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.api.v3.client;

import com.neotys.ascode.api.v3.client.ApiException;
import com.neotys.ascode.api.v3.client.api.RuntimeApi;
import com.neotys.ascode.api.v3.client.model.Error;
import java.io.File;
import com.neotys.ascode.api.v3.client.model.ProjectDefinition;
import com.neotys.ascode.api.v3.client.model.RateLimitError;
import com.neotys.ascode.api.v3.client.model.RunTestDefinition;
import com.neotys.ascode.api.v3.client.model.TestCreate;
import com.neotys.ascode.api.v3.client.model.TestCreated;
import com.neotys.ascode.api.v3.client.model.TestDefinition;
import com.neotys.ascode.api.v3.client.model.TestDefinitionList;
import com.neotys.ascode.api.v3.client.model.TestUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for RuntimeApi
 */
@Ignore
public class RuntimeApiTest {

    private final RuntimeApi api = new RuntimeApi();

    /**
     * Delete a test
     *
     * Delete the test with the specified id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTestTest() throws ApiException {
        String workspaceId = null;
        String testId = null;
        String deleteResults = null;
        TestDefinition response = api.deleteTest(workspaceId, testId, deleteResults);

        // TODO: test validations
    }
    /**
     * Get a test
     *
     * Get the test
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestTest() throws ApiException {
        String workspaceId = null;
        String testId = null;
        TestDefinition response = api.getTest(workspaceId, testId);

        // TODO: test validations
    }
    /**
     * Get a test list
     *
     * Lists the tests of the Workspace. ___ *Sortable fields :*   - name   - projectName   - lastUpdateDate (descending sort by default : the most recent first)   - lastRunDate   - userModifierName 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestListTest() throws ApiException {
        String workspaceId = null;
        Integer limit = null;
        Integer offset = null;
        String sort = null;
        TestDefinitionList response = api.getTestList(workspaceId, limit, offset, sort);

        // TODO: test validations
    }
    /**
     * Starts a test
     *
     * Starts a test of the Workspace according to the method parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestsRunTest() throws ApiException {
        String workspaceId = null;
        String testId = null;
        String testResultName = null;
        String testResultDescription = null;
        String asCode = null;
        String reservationId = null;
        Long reservationDuration = null;
        Integer reservationWebVUs = null;
        Integer reservationSAPVUs = null;
        Integer reservationCitrixVUs = null;
        Boolean publishTestResult = null;
        RunTestDefinition response = api.getTestsRun(workspaceId, testId, testResultName, testResultDescription, asCode, reservationId, reservationDuration, reservationWebVUs, reservationSAPVUs, reservationCitrixVUs, publishTestResult);

        // TODO: test validations
    }
    /**
     * Partially update a test
     *
     * Update only the specified fields of the test
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchTestTest() throws ApiException {
        String workspaceId = null;
        String testId = null;
        TestUpdate body = null;
        TestDefinition response = api.patchTest(workspaceId, testId, body);

        // TODO: test validations
    }
    /**
     * Create a new test
     *
     * Create a new test with the specified name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCreateTestTest() throws ApiException {
        TestCreate body = null;
        String workspaceId = null;
        TestCreated response = api.postCreateTest(body, workspaceId);

        // TODO: test validations
    }
    /**
     * Uploads a NeoLoad project zip file or a standalone as code file
     *
     * Uploads a NeoLoad project of the Workspace corresponding to the parameters. The maximum size file is 250 MB
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUploadProjectTest() throws ApiException {
        File file = null;
        String workspaceId = null;
        String testId = null;
        ProjectDefinition response = api.postUploadProject(file, workspaceId, testId);

        // TODO: test validations
    }
    /**
     * Fully update a test
     *
     * Update all fields of the test
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTestTest() throws ApiException {
        TestUpdate body = null;
        String workspaceId = null;
        String testId = null;
        TestDefinition response = api.putTest(body, workspaceId, testId);

        // TODO: test validations
    }
    /**
     * Get project&#x27;s metadata
     *
     * Get project&#x27;s metadata
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readProjectMetadataTest() throws ApiException {
        String workspaceId = null;
        String testId = null;
        ProjectDefinition response = api.readProjectMetadata(workspaceId, testId);

        // TODO: test validations
    }


    @Test
    public void testUploadCreationofProject()
    {
        /*ApiClient client=new ApiClient();
        client.setApiKey("YOUTOKEN");
        client.setBasePath("https://neoload-api.saas.neotys.com/v3");
        RuntimeApi runtimeApi=new RuntimeApi(client);
        TestCreate testSettingsCreate=new TestCreate();
        testSettingsCreate.setControllerZoneId("defaultzone");
        testSettingsCreate.setDescription("Super test v42222");
        testSettingsCreate.setName("Awesome testsdededed");
        testSettingsCreate.setTestResultNamingPattern("Test ApiV2  #${runID}");
        HashMap<String,Integer> lgzones= new HashMap<String,Integer>();
        lgzones.put("defaultzone",1);
        testSettingsCreate.setLgZoneIds(lgzones);
        try {
            String workspaceid="5e3acde2e860a132744ca916";
            TestCreated testSettingsCreated=runtimeApi.postCreateTest(testSettingsCreate,workspaceid);
            client.setBasePath("https://neoload-files.saas.neotys.com/v3");
            runtimeApi=new RuntimeApi(client);

            File project=new File("/home/hrexed/neoload_projects/v7.2/Sample_Project.zip");
            ProjectDefinition projectDefinition =  runtimeApi.postUploadProject(project,workspaceid,testSettingsCreated.getId());
            System.out.println(projectDefinition.getScenarios().stream().map(scenarioDefinition ->{ return scenarioDefinition.getScenarioName();}).collect(Collectors.joining(",")));
        } catch (ApiException e) {
            e.printStackTrace();
        }*/
    }
}
