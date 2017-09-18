package org.wso2.carbon.identity.user.core.internal;

import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.user.core.UserStoreManagerFactory;
import org.wso2.carbon.user.core.claim.ClaimManagerFactory;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * @scr.component name="identity.user.core.dscomponent" immediate=true
 * @scr.reference name="user.realmservice.default"
 * interface="org.wso2.carbon.user.core.service.RealmService" cardinality="1..1"
 * policy="dynamic" bind="setRealmService"
 * unbind="unsetRealmService"
 * @scr.reference name="claim.mgt.component"
 * interface="org.wso2.carbon.user.core.claim.ClaimManagerFactory" cardinality="1..1"
 * policy="dynamic"  bind="setClaimManagerFactory"
 * unbind="unsetClaimManagerFactory"
 */
public class IdentityUserStoreManagerComponent {

    protected void activate(ComponentContext ctxt) {
        try {

            ctxt.getBundleContext().registerService(UserStoreManagerFactory.class.getName(),
                                                    new IdentityUserStoreManagerFactory(),
                                                    null);
            System.out.println("IdentityUserStoreManagerComponent activated.");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    protected void deactivate(ComponentContext ctxt) {
        System.out.println("IdentityUserStoreManagerComponent deactivated.");
    }

    protected void setRealmService(RealmService realmService) {
        System.out.println("RealmService set to IdentityUserStoreManagerComponent.");
    }

    protected void unsetRealmService(RealmService realmService) {
        System.out.println("RealmService unset from IdentityUserStoreManagerComponent.");
    }

    protected void setClaimManagerFactory(ClaimManagerFactory claimManagerFactory) {
        System.out.println("ClaimManagerFactory set to IdentityUserStoreManagerComponent.");
    }

    protected void unsetClaimManagerFactory(ClaimManagerFactory claimManagerFactory) {
        System.out.println("ClaimManagerFactory unset from IdentityUserStoreManagerComponent.");
    }
}
