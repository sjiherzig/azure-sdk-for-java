// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.RegulatoryComplianceStandardsClient;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceStandardInner;
import com.azure.resourcemanager.security.models.RegulatoryComplianceStandardList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RegulatoryComplianceStandardsClient. */
public final class RegulatoryComplianceStandardsClientImpl implements RegulatoryComplianceStandardsClient {
    private final ClientLogger logger = new ClientLogger(RegulatoryComplianceStandardsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RegulatoryComplianceStandardsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of RegulatoryComplianceStandardsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RegulatoryComplianceStandardsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    RegulatoryComplianceStandardsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterRegulatoryComplianceStandards to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterRegula")
    private interface RegulatoryComplianceStandardsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceStandardList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards"
                + "/{regulatoryComplianceStandardName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceStandardInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regulatoryComplianceStandardName") String regulatoryComplianceStandardName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceStandardList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceStandardInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            filter,
                            accept,
                            context))
            .<PagedResponse<RegulatoryComplianceStandardInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceStandardInner>> listSinglePageAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), filter, accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceStandardInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceStandardInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceStandardInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceStandardInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Supported regulatory compliance standards details and state.
     *
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceStandardInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Supported regulatory compliance details state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance standard details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceStandardInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            regulatoryComplianceStandardName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Supported regulatory compliance details state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance standard details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceStandardInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                regulatoryComplianceStandardName,
                accept,
                context);
    }

    /**
     * Supported regulatory compliance details state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance standard details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RegulatoryComplianceStandardInner> getAsync(String regulatoryComplianceStandardName) {
        return getWithResponseAsync(regulatoryComplianceStandardName)
            .flatMap(
                (Response<RegulatoryComplianceStandardInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Supported regulatory compliance details state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance standard details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RegulatoryComplianceStandardInner get(String regulatoryComplianceStandardName) {
        return getAsync(regulatoryComplianceStandardName).block();
    }

    /**
     * Supported regulatory compliance details state for selected standard.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance standard details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RegulatoryComplianceStandardInner> getWithResponse(
        String regulatoryComplianceStandardName, Context context) {
        return getWithResponseAsync(regulatoryComplianceStandardName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceStandardInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<RegulatoryComplianceStandardInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance standards response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceStandardInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}