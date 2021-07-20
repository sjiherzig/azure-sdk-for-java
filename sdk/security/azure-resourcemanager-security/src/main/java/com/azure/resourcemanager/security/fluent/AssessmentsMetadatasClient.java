// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataInner;

/** An instance of this class provides access to all the operations defined in AssessmentsMetadatasClient. */
public interface AssessmentsMetadatasClient {
    /**
     * Get metadata information on all assessment types.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityAssessmentMetadataInner> list();

    /**
     * Get metadata information on all assessment types.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityAssessmentMetadataInner> list(Context context);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityAssessmentMetadataInner get(String assessmentMetadataName);

    /**
     * Get metadata information on an assessment type.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityAssessmentMetadataInner> getWithResponse(String assessmentMetadataName, Context context);

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityAssessmentMetadataInner> listBySubscription();

    /**
     * Get metadata information on all assessment types in a specific subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on all assessment types in a specific subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityAssessmentMetadataInner> listBySubscription(Context context);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityAssessmentMetadataInner getInSubscription(String assessmentMetadataName);

    /**
     * Get metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata information on an assessment type in a specific subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityAssessmentMetadataInner> getInSubscriptionWithResponse(
        String assessmentMetadataName, Context context);

    /**
     * Create metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param assessmentMetadata AssessmentMetadata object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security assessment metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityAssessmentMetadataInner createInSubscription(
        String assessmentMetadataName, SecurityAssessmentMetadataInner assessmentMetadata);

    /**
     * Create metadata information on an assessment type in a specific subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param assessmentMetadata AssessmentMetadata object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security assessment metadata.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityAssessmentMetadataInner> createInSubscriptionWithResponse(
        String assessmentMetadataName, SecurityAssessmentMetadataInner assessmentMetadata, Context context);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteInSubscription(String assessmentMetadataName);

    /**
     * Delete metadata information on an assessment type in a specific subscription, will cause the deletion of all the
     * assessments of that type in that subscription.
     *
     * @param assessmentMetadataName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteInSubscriptionWithResponse(String assessmentMetadataName, Context context);
}