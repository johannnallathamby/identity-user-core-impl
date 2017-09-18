package org.wso2.carbon.identity.user.core.internal;

import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.UserStoreManagerFactory;
import org.wso2.carbon.user.core.claim.ClaimManager;

/**
 * Created by johann on 6/11/17.
 */
public class IdentityUserStoreManagerFactory implements UserStoreManagerFactory {
    @Override
    public UserStoreManager createUserStoreManager(RealmConfiguration realmConfiguration, ClaimManager claimManager,
                                                   int tenantId) {
        return new IdentityUserStoreManager(realmConfiguration, claimManager, tenantId);
    }
}
