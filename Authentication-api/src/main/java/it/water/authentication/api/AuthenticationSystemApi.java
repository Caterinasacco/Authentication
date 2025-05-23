package it.water.authentication.api;

import it.water.core.api.security.Authenticable;
import it.water.core.api.service.BaseSystemApi;

/**
 * @Generated by Water Generator
 * This interface defines the internally exposed methods allows interaction with them bypassing permission system.
 */
public interface AuthenticationSystemApi extends BaseSystemApi {
    /**
     * @param username
     * @param password
     * @return
     */
    Authenticable login(String username, String password);

    /**
     * Logs in providing a specific component filter in order to select the right Authentication Provider if multiple are present
     *
     * @param username
     * @param password
     * @param authProviderFilter
     * @return
     */
    Authenticable login(String username, String password, String authProviderFilter);

    /**
     * Generates a valid token for an authenticable
     *
     * @param authenticable
     * @return
     */
    String generateToken(Authenticable authenticable);

}