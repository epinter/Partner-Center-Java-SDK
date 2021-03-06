// -----------------------------------------------------------------------
// <copyright file="IManagedServiceCollection.java" company="Microsoft">
//      Copyright (c) Microsoft Corporation.  All rights reserved.
// </copyright>
// -----------------------------------------------------------------------

package com.microsoft.store.partnercenter.managedservices;

import com.microsoft.store.partnercenter.IPartnerComponentString;
import com.microsoft.store.partnercenter.genericoperations.IEntireEntityCollectionRetrievalOperations;
import com.microsoft.store.partnercenter.models.ResourceCollection;
import com.microsoft.store.partnercenter.models.managedservices.ManagedService;

/**
 * Holds the customer's managed services operations.
 */
public interface IManagedServiceCollection
    extends IPartnerComponentString,
    IEntireEntityCollectionRetrievalOperations<ManagedService, ResourceCollection<ManagedService>>
{
    /**
     * Retrieves all managed services. This operation is currently only supported for user based credentials.
     * 
     * @return The managed services.
     */
    ResourceCollection<ManagedService> get();

}
