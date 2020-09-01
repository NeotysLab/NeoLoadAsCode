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

import com.neotys.ascode.api.v3.client.api.WorkspacesApi;
import com.neotys.ascode.api.v3.client.ApiException;
import com.neotys.ascode.api.v3.client.model.Error;
import com.neotys.ascode.api.v3.client.model.RateLimitError;
import com.neotys.ascode.api.v3.client.model.WorkspaceDefinitionList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkspacesApi
 */
@Ignore
public class WorkspacesApiTest {

    private final WorkspacesApi api = new WorkspacesApi();

    /**
     * Get the list of all accessible Workspaces
     *
     * Lists all accessible Workspaces.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkspaceListTest() throws ApiException {
        WorkspaceDefinitionList response = api.getWorkspaceList();

        // TODO: test validations
    }
}
