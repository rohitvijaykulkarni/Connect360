
package com.initiate.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.initiate.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProviderTaskId_QNAME = new QName("http://client.initiate.com/", "providerTaskId");
    private final static QName _CreateCustomProviderTask_QNAME = new QName("http://client.initiate.com/", "createCustomProviderTask");
    private final static QName _SearchClientListAsId_QNAME = new QName("http://client.initiate.com/", "searchClientListAsId");
    private final static QName _UpdateClientWithOptions_QNAME = new QName("http://client.initiate.com/", "updateClientWithOptions");
    private final static QName _UpdateProviderResponse_QNAME = new QName("http://client.initiate.com/", "updateProviderResponse");
    private final static QName _UndoProviderRecordOperation_QNAME = new QName("http://client.initiate.com/", "undoProviderRecordOperation");
    private final static QName _CredentialId_QNAME = new QName("http://client.initiate.com/", "credentialId");
    private final static QName _UndoClientRecordOperation_QNAME = new QName("http://client.initiate.com/", "undoClientRecordOperation");
    private final static QName _SearchForIdListResponse_QNAME = new QName("http://client.initiate.com/", "searchForIdListResponse");
    private final static QName _ClientTextSearchResult_QNAME = new QName("http://client.initiate.com/", "clientTextSearchResult");
    private final static QName _UpdateProviderWithOptions_QNAME = new QName("http://client.initiate.com/", "updateProviderWithOptions");
    private final static QName _CreateProvider_QNAME = new QName("http://client.initiate.com/", "createProvider");
    private final static QName _UpdateQualifiedProvResponse_QNAME = new QName("http://client.initiate.com/", "updateQualifiedProvResponse");
    private final static QName _UndeleteProvider_QNAME = new QName("http://client.initiate.com/", "undeleteProvider");
    private final static QName _UpdateQualifiedProvWithOptions_QNAME = new QName("http://client.initiate.com/", "updateQualifiedProvWithOptions");
    private final static QName _SearchForProvListResponse_QNAME = new QName("http://client.initiate.com/", "searchForProvListResponse");
    private final static QName _ProvEntitySearchResult_QNAME = new QName("http://client.initiate.com/", "provEntitySearchResult");
    private final static QName _TextSearchForTermList_QNAME = new QName("http://client.initiate.com/", "textSearchForTermList");
    private final static QName _CreateClient_QNAME = new QName("http://client.initiate.com/", "createClient");
    private final static QName _ProviderCustomTask_QNAME = new QName("http://client.initiate.com/", "providerCustomTask");
    private final static QName _IdEntityTask_QNAME = new QName("http://client.initiate.com/", "idEntityTask");
    private final static QName _UnmergeClient_QNAME = new QName("http://client.initiate.com/", "unmergeClient");
    private final static QName _CompareProviderAsProv_QNAME = new QName("http://client.initiate.com/", "compareProviderAsProv");
    private final static QName _CreateClientWithOptions_QNAME = new QName("http://client.initiate.com/", "createClientWithOptions");
    private final static QName _SearchClientListAsIdResponse_QNAME = new QName("http://client.initiate.com/", "searchClientListAsIdResponse");
    private final static QName _GetClientTask_QNAME = new QName("http://client.initiate.com/", "getClientTask");
    private final static QName _GetClientList_QNAME = new QName("http://client.initiate.com/", "getClientList");
    private final static QName _MergeProvider_QNAME = new QName("http://client.initiate.com/", "mergeProvider");
    private final static QName _MergeProviderResponse_QNAME = new QName("http://client.initiate.com/", "mergeProviderResponse");
    private final static QName _MergeClientResponse_QNAME = new QName("http://client.initiate.com/", "mergeClientResponse");
    private final static QName _SearchProviderListAsProvResponse_QNAME = new QName("http://client.initiate.com/", "searchProviderListAsProvResponse");
    private final static QName _CreateProviderResponse_QNAME = new QName("http://client.initiate.com/", "createProviderResponse");
    private final static QName _DropProvider_QNAME = new QName("http://client.initiate.com/", "dropProvider");
    private final static QName _UndoClientRecordOperationResponse_QNAME = new QName("http://client.initiate.com/", "undoClientRecordOperationResponse");
    private final static QName _UpdateIdEntityWithOptions_QNAME = new QName("http://client.initiate.com/", "updateIdEntityWithOptions");
    private final static QName _DeleteProvider_QNAME = new QName("http://client.initiate.com/", "deleteProvider");
    private final static QName _GetProviderTask_QNAME = new QName("http://client.initiate.com/", "getProviderTask");
    private final static QName _MarkIdEntityLinkResponse_QNAME = new QName("http://client.initiate.com/", "markIdEntityLinkResponse");
    private final static QName _ProviderSearchResult_QNAME = new QName("http://client.initiate.com/", "providerSearchResult");
    private final static QName _CreateClientWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "createClientWithOptionsResponse");
    private final static QName _GetProvEntityListByProvEntityIdsResponse_QNAME = new QName("http://client.initiate.com/", "getProvEntityListByProvEntityIdsResponse");
    private final static QName _ScoreClientAsIdResponse_QNAME = new QName("http://client.initiate.com/", "scoreClientAsIdResponse");
    private final static QName _UnmergeProviderResponse_QNAME = new QName("http://client.initiate.com/", "unmergeProviderResponse");
    private final static QName _ScoreClientAsId_QNAME = new QName("http://client.initiate.com/", "scoreClientAsId");
    private final static QName _UpdateProvEntityWithOptions_QNAME = new QName("http://client.initiate.com/", "updateProvEntityWithOptions");
    private final static QName _ClientTaskId_QNAME = new QName("http://client.initiate.com/", "clientTaskId");
    private final static QName _ProvEntityTask_QNAME = new QName("http://client.initiate.com/", "provEntityTask");
    private final static QName _GetIdEntityTask_QNAME = new QName("http://client.initiate.com/", "getIdEntityTask");
    private final static QName _GetProviderTaskResponse_QNAME = new QName("http://client.initiate.com/", "getProviderTaskResponse");
    private final static QName _UpdateProviderWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateProviderWithOptionsResponse");
    private final static QName _DropClient_QNAME = new QName("http://client.initiate.com/", "dropClient");
    private final static QName _UpdateProviderTask_QNAME = new QName("http://client.initiate.com/", "updateProviderTask");
    private final static QName _UpdateQualifiedProv_QNAME = new QName("http://client.initiate.com/", "updateQualifiedProv");
    private final static QName _TextSearchForProvListResponse_QNAME = new QName("http://client.initiate.com/", "textSearchForProvListResponse");
    private final static QName _LinkProviderToProvEntity_QNAME = new QName("http://client.initiate.com/", "linkProviderToProvEntity");
    private final static QName _UnlinkProviderFromProvEntityResponse_QNAME = new QName("http://client.initiate.com/", "unlinkProviderFromProvEntityResponse");
    private final static QName _DeleteProviderResponse_QNAME = new QName("http://client.initiate.com/", "deleteProviderResponse");
    private final static QName _GetIdEntityListByIdEntityIdsResponse_QNAME = new QName("http://client.initiate.com/", "getIdEntityListByIdEntityIdsResponse");
    private final static QName _UndoProviderRecordOperationResponse_QNAME = new QName("http://client.initiate.com/", "undoProviderRecordOperationResponse");
    private final static QName _MarkProvEntityLink_QNAME = new QName("http://client.initiate.com/", "markProvEntityLink");
    private final static QName _ProviderTextSearchResult_QNAME = new QName("http://client.initiate.com/", "providerTextSearchResult");
    private final static QName _AuditData_QNAME = new QName("http://client.initiate.com/", "auditData");
    private final static QName _CreateOrUpdateProviderWithOptions_QNAME = new QName("http://client.initiate.com/", "createOrUpdateProviderWithOptions");
    private final static QName _GetProviderList_QNAME = new QName("http://client.initiate.com/", "getProviderList");
    private final static QName _TextSearchForProvList_QNAME = new QName("http://client.initiate.com/", "textSearchForProvList");
    private final static QName _TextSearchProviderListAsProv_QNAME = new QName("http://client.initiate.com/", "textSearchProviderListAsProv");
    private final static QName _MasterDataServiceException_QNAME = new QName("http://client.initiate.com/", "MasterDataServiceException");
    private final static QName _ProviderTextSearchHitResult_QNAME = new QName("http://client.initiate.com/", "providerTextSearchHitResult");
    private final static QName _MarkIdEntityLink_QNAME = new QName("http://client.initiate.com/", "markIdEntityLink");
    private final static QName _CompareClientAsIdResponse_QNAME = new QName("http://client.initiate.com/", "compareClientAsIdResponse");
    private final static QName _TextSearchClientListAsId_QNAME = new QName("http://client.initiate.com/", "textSearchClientListAsId");
    private final static QName _UpdateClientResponse_QNAME = new QName("http://client.initiate.com/", "updateClientResponse");
    private final static QName _CreateOrUpdateClient_QNAME = new QName("http://client.initiate.com/", "createOrUpdateClient");
    private final static QName _UndeleteProviderResponse_QNAME = new QName("http://client.initiate.com/", "undeleteProviderResponse");
    private final static QName _GetProvEntityTaskResponse_QNAME = new QName("http://client.initiate.com/", "getProvEntityTaskResponse");
    private final static QName _UpdateQualifiedId_QNAME = new QName("http://client.initiate.com/", "updateQualifiedId");
    private final static QName _SearchForClientTaskByCredentialIds_QNAME = new QName("http://client.initiate.com/", "searchForClientTaskByCredentialIds");
    private final static QName _LinkClientToIdEntityResponse_QNAME = new QName("http://client.initiate.com/", "linkClientToIdEntityResponse");
    private final static QName _UnmergeClientResponse_QNAME = new QName("http://client.initiate.com/", "unmergeClientResponse");
    private final static QName _GetProvEntityList_QNAME = new QName("http://client.initiate.com/", "getProvEntityList");
    private final static QName _SearchForProvList_QNAME = new QName("http://client.initiate.com/", "searchForProvList");
    private final static QName _SearchForProviderTaskByCredentialIdsResponse_QNAME = new QName("http://client.initiate.com/", "searchForProviderTaskByCredentialIdsResponse");
    private final static QName _ScoreProviderAsProvResponse_QNAME = new QName("http://client.initiate.com/", "scoreProviderAsProvResponse");
    private final static QName _UpdateClientTask_QNAME = new QName("http://client.initiate.com/", "updateClientTask");
    private final static QName _UpdateProviderTaskResponse_QNAME = new QName("http://client.initiate.com/", "updateProviderTaskResponse");
    private final static QName _DeleteClient_QNAME = new QName("http://client.initiate.com/", "deleteClient");
    private final static QName _MarkProvEntityLinkResponse_QNAME = new QName("http://client.initiate.com/", "markProvEntityLinkResponse");
    private final static QName _LinkClientToIdEntity_QNAME = new QName("http://client.initiate.com/", "linkClientToIdEntity");
    private final static QName _GetIdEntityList_QNAME = new QName("http://client.initiate.com/", "getIdEntityList");
    private final static QName _MergeClient_QNAME = new QName("http://client.initiate.com/", "mergeClient");
    private final static QName _CreateOrUpdateProviderWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "createOrUpdateProviderWithOptionsResponse");
    private final static QName _CreateProviderWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "createProviderWithOptionsResponse");
    private final static QName _ClientRecordTask_QNAME = new QName("http://client.initiate.com/", "clientRecordTask");
    private final static QName _UpdateQualifiedIdResponse_QNAME = new QName("http://client.initiate.com/", "updateQualifiedIdResponse");
    private final static QName _SearchForIdList_QNAME = new QName("http://client.initiate.com/", "searchForIdList");
    private final static QName _UpdateIdEntityWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateIdEntityWithOptionsResponse");
    private final static QName _IdEntity_QNAME = new QName("http://client.initiate.com/", "idEntity");
    private final static QName _DropClientResponse_QNAME = new QName("http://client.initiate.com/", "dropClientResponse");
    private final static QName _GetProvEntityListByProvEntityIds_QNAME = new QName("http://client.initiate.com/", "getProvEntityListByProvEntityIds");
    private final static QName _GetProvEntityTask_QNAME = new QName("http://client.initiate.com/", "getProvEntityTask");
    private final static QName _UpdateProvEntity_QNAME = new QName("http://client.initiate.com/", "updateProvEntity");
    private final static QName _UpdateQualifiedIdWithOptions_QNAME = new QName("http://client.initiate.com/", "updateQualifiedIdWithOptions");
    private final static QName _CreateOrUpdateClientWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "createOrUpdateClientWithOptionsResponse");
    private final static QName _CreateOrUpdateClientResponse_QNAME = new QName("http://client.initiate.com/", "createOrUpdateClientResponse");
    private final static QName _SearchForProviderTaskByProviderIds_QNAME = new QName("http://client.initiate.com/", "searchForProviderTaskByProviderIds");
    private final static QName _CompareProviderAsProvResponse_QNAME = new QName("http://client.initiate.com/", "compareProviderAsProvResponse");
    private final static QName _UnmergeProvider_QNAME = new QName("http://client.initiate.com/", "unmergeProvider");
    private final static QName _CreateOrUpdateClientWithOptions_QNAME = new QName("http://client.initiate.com/", "createOrUpdateClientWithOptions");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://client.initiate.com/", "deleteClientResponse");
    private final static QName _UpdateProvEntityWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateProvEntityWithOptionsResponse");
    private final static QName _GetProviderListResponse_QNAME = new QName("http://client.initiate.com/", "getProviderListResponse");
    private final static QName _CreateCustomProviderTaskResponse_QNAME = new QName("http://client.initiate.com/", "createCustomProviderTaskResponse");
    private final static QName _TextSearchProviderListAsProvResponse_QNAME = new QName("http://client.initiate.com/", "textSearchProviderListAsProvResponse");
    private final static QName _CreateCustomClientTaskResponse_QNAME = new QName("http://client.initiate.com/", "createCustomClientTaskResponse");
    private final static QName _GetClientListResponse_QNAME = new QName("http://client.initiate.com/", "getClientListResponse");
    private final static QName _SearchForProviderTaskByCredentialIds_QNAME = new QName("http://client.initiate.com/", "searchForProviderTaskByCredentialIds");
    private final static QName _UpdateClientWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateClientWithOptionsResponse");
    private final static QName _CreateOrUpdateProviderResponse_QNAME = new QName("http://client.initiate.com/", "createOrUpdateProviderResponse");
    private final static QName _UndeleteClient_QNAME = new QName("http://client.initiate.com/", "undeleteClient");
    private final static QName _ProvEntity_QNAME = new QName("http://client.initiate.com/", "provEntity");
    private final static QName _GetIdEntityTaskResponse_QNAME = new QName("http://client.initiate.com/", "getIdEntityTaskResponse");
    private final static QName _LinkProviderToProvEntityResponse_QNAME = new QName("http://client.initiate.com/", "linkProviderToProvEntityResponse");
    private final static QName _TextSearchForIdList_QNAME = new QName("http://client.initiate.com/", "textSearchForIdList");
    private final static QName _SearchForClientTaskByCredentialIdsResponse_QNAME = new QName("http://client.initiate.com/", "searchForClientTaskByCredentialIdsResponse");
    private final static QName _UpdateProvEntityResponse_QNAME = new QName("http://client.initiate.com/", "updateProvEntityResponse");
    private final static QName _UpdateIdEntity_QNAME = new QName("http://client.initiate.com/", "updateIdEntity");
    private final static QName _ClientTextSearchHitResult_QNAME = new QName("http://client.initiate.com/", "clientTextSearchHitResult");
    private final static QName _ScoreProviderAsProv_QNAME = new QName("http://client.initiate.com/", "scoreProviderAsProv");
    private final static QName _TextSearchForIdListResponse_QNAME = new QName("http://client.initiate.com/", "textSearchForIdListResponse");
    private final static QName _UpdateQualifiedIdWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateQualifiedIdWithOptionsResponse");
    private final static QName _SearchForClientTaskByClientIds_QNAME = new QName("http://client.initiate.com/", "searchForClientTaskByClientIds");
    private final static QName _UpdateIdEntityResponse_QNAME = new QName("http://client.initiate.com/", "updateIdEntityResponse");
    private final static QName _CreateOrUpdateProvider_QNAME = new QName("http://client.initiate.com/", "createOrUpdateProvider");
    private final static QName _ClientCustomTask_QNAME = new QName("http://client.initiate.com/", "clientCustomTask");
    private final static QName _CreateCustomClientTask_QNAME = new QName("http://client.initiate.com/", "createCustomClientTask");
    private final static QName _UnlinkClientFromIdEntity_QNAME = new QName("http://client.initiate.com/", "unlinkClientFromIdEntity");
    private final static QName _CreateClientResponse_QNAME = new QName("http://client.initiate.com/", "createClientResponse");
    private final static QName _UndeleteClientResponse_QNAME = new QName("http://client.initiate.com/", "undeleteClientResponse");
    private final static QName _UnlinkProviderFromProvEntity_QNAME = new QName("http://client.initiate.com/", "unlinkProviderFromProvEntity");
    private final static QName _DropProviderResponse_QNAME = new QName("http://client.initiate.com/", "dropProviderResponse");
    private final static QName _GetClientTaskResponse_QNAME = new QName("http://client.initiate.com/", "getClientTaskResponse");
    private final static QName _UpdateProvider_QNAME = new QName("http://client.initiate.com/", "updateProvider");
    private final static QName _Client_QNAME = new QName("http://client.initiate.com/", "client");
    private final static QName _GetIdEntityListResponse_QNAME = new QName("http://client.initiate.com/", "getIdEntityListResponse");
    private final static QName _SearchProviderListAsProv_QNAME = new QName("http://client.initiate.com/", "searchProviderListAsProv");
    private final static QName _UpdateClientTaskResponse_QNAME = new QName("http://client.initiate.com/", "updateClientTaskResponse");
    private final static QName _TermSearchResult_QNAME = new QName("http://client.initiate.com/", "termSearchResult");
    private final static QName _UnlinkClientFromIdEntityResponse_QNAME = new QName("http://client.initiate.com/", "unlinkClientFromIdEntityResponse");
    private final static QName _Provider_QNAME = new QName("http://client.initiate.com/", "provider");
    private final static QName _GetIdEntityListByIdEntityIds_QNAME = new QName("http://client.initiate.com/", "getIdEntityListByIdEntityIds");
    private final static QName _GetProvEntityListResponse_QNAME = new QName("http://client.initiate.com/", "getProvEntityListResponse");
    private final static QName _TextSearchClientListAsIdResponse_QNAME = new QName("http://client.initiate.com/", "textSearchClientListAsIdResponse");
    private final static QName _IdEntitySearchResult_QNAME = new QName("http://client.initiate.com/", "idEntitySearchResult");
    private final static QName _SearchForClientTaskByClientIdsResponse_QNAME = new QName("http://client.initiate.com/", "searchForClientTaskByClientIdsResponse");
    private final static QName _UpdateQualifiedProvWithOptionsResponse_QNAME = new QName("http://client.initiate.com/", "updateQualifiedProvWithOptionsResponse");
    private final static QName _ProviderRecordTask_QNAME = new QName("http://client.initiate.com/", "providerRecordTask");
    private final static QName _CreateProviderWithOptions_QNAME = new QName("http://client.initiate.com/", "createProviderWithOptions");
    private final static QName _SearchForProviderTaskByProviderIdsResponse_QNAME = new QName("http://client.initiate.com/", "searchForProviderTaskByProviderIdsResponse");
    private final static QName _UpdateClient_QNAME = new QName("http://client.initiate.com/", "updateClient");
    private final static QName _ClientSearchResult_QNAME = new QName("http://client.initiate.com/", "clientSearchResult");
    private final static QName _CompareClientAsId_QNAME = new QName("http://client.initiate.com/", "compareClientAsId");
    private final static QName _TextSearchForTermListResponse_QNAME = new QName("http://client.initiate.com/", "textSearchForTermListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.initiate.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.initiate.client.TextSearchHitResult.StoredValues }
     * 
     */
    public com.initiate.client.TextSearchHitResult.StoredValues createTextSearchHitResultStoredValues() {
        return new com.initiate.client.TextSearchHitResult.StoredValues();
    }

    /**
     * Create an instance of {@link ClientTask }
     * 
     */
    public ClientTask createClientTask() {
        return new ClientTask();
    }

    /**
     * Create an instance of {@link ProviderTask }
     * 
     */
    public ProviderTask createProviderTask() {
        return new ProviderTask();
    }

    /**
     * Create an instance of {@link ProvEntity }
     * 
     */
    public ProvEntity createProvEntity() {
        return new ProvEntity();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Provider }
     * 
     */
    public Provider createProvider() {
        return new Provider();
    }

    /**
     * Create an instance of {@link IdEntity }
     * 
     */
    public IdEntity createIdEntity() {
        return new IdEntity();
    }

    /**
     * Create an instance of {@link CreateProviderResponse }
     * 
     */
    public CreateProviderResponse createCreateProviderResponse() {
        return new CreateProviderResponse();
    }

    /**
     * Create an instance of {@link DropProvider }
     * 
     */
    public DropProvider createDropProvider() {
        return new DropProvider();
    }

    /**
     * Create an instance of {@link MergeClientResponse }
     * 
     */
    public MergeClientResponse createMergeClientResponse() {
        return new MergeClientResponse();
    }

    /**
     * Create an instance of {@link SearchProviderListAsProvResponse }
     * 
     */
    public SearchProviderListAsProvResponse createSearchProviderListAsProvResponse() {
        return new SearchProviderListAsProvResponse();
    }

    /**
     * Create an instance of {@link MergeProvider }
     * 
     */
    public MergeProvider createMergeProvider() {
        return new MergeProvider();
    }

    /**
     * Create an instance of {@link MergeProviderResponse }
     * 
     */
    public MergeProviderResponse createMergeProviderResponse() {
        return new MergeProviderResponse();
    }

    /**
     * Create an instance of {@link GetClientList }
     * 
     */
    public GetClientList createGetClientList() {
        return new GetClientList();
    }

    /**
     * Create an instance of {@link GetClientTask }
     * 
     */
    public GetClientTask createGetClientTask() {
        return new GetClientTask();
    }

    /**
     * Create an instance of {@link CreateClientWithOptions }
     * 
     */
    public CreateClientWithOptions createCreateClientWithOptions() {
        return new CreateClientWithOptions();
    }

    /**
     * Create an instance of {@link SearchClientListAsIdResponse }
     * 
     */
    public SearchClientListAsIdResponse createSearchClientListAsIdResponse() {
        return new SearchClientListAsIdResponse();
    }

    /**
     * Create an instance of {@link UnmergeClient }
     * 
     */
    public UnmergeClient createUnmergeClient() {
        return new UnmergeClient();
    }

    /**
     * Create an instance of {@link CompareProviderAsProv }
     * 
     */
    public CompareProviderAsProv createCompareProviderAsProv() {
        return new CompareProviderAsProv();
    }

    /**
     * Create an instance of {@link IdEntityTask }
     * 
     */
    public IdEntityTask createIdEntityTask() {
        return new IdEntityTask();
    }

    /**
     * Create an instance of {@link ProviderCustomTask }
     * 
     */
    public ProviderCustomTask createProviderCustomTask() {
        return new ProviderCustomTask();
    }

    /**
     * Create an instance of {@link CreateClient }
     * 
     */
    public CreateClient createCreateClient() {
        return new CreateClient();
    }

    /**
     * Create an instance of {@link TextSearchForTermList }
     * 
     */
    public TextSearchForTermList createTextSearchForTermList() {
        return new TextSearchForTermList();
    }

    /**
     * Create an instance of {@link ProvEntitySearchResult }
     * 
     */
    public ProvEntitySearchResult createProvEntitySearchResult() {
        return new ProvEntitySearchResult();
    }

    /**
     * Create an instance of {@link UpdateQualifiedProvWithOptions }
     * 
     */
    public UpdateQualifiedProvWithOptions createUpdateQualifiedProvWithOptions() {
        return new UpdateQualifiedProvWithOptions();
    }

    /**
     * Create an instance of {@link SearchForProvListResponse }
     * 
     */
    public SearchForProvListResponse createSearchForProvListResponse() {
        return new SearchForProvListResponse();
    }

    /**
     * Create an instance of {@link CreateProvider }
     * 
     */
    public CreateProvider createCreateProvider() {
        return new CreateProvider();
    }

    /**
     * Create an instance of {@link UpdateQualifiedProvResponse }
     * 
     */
    public UpdateQualifiedProvResponse createUpdateQualifiedProvResponse() {
        return new UpdateQualifiedProvResponse();
    }

    /**
     * Create an instance of {@link UndeleteProvider }
     * 
     */
    public UndeleteProvider createUndeleteProvider() {
        return new UndeleteProvider();
    }

    /**
     * Create an instance of {@link ClientTextSearchResult }
     * 
     */
    public ClientTextSearchResult createClientTextSearchResult() {
        return new ClientTextSearchResult();
    }

    /**
     * Create an instance of {@link UpdateProviderWithOptions }
     * 
     */
    public UpdateProviderWithOptions createUpdateProviderWithOptions() {
        return new UpdateProviderWithOptions();
    }

    /**
     * Create an instance of {@link SearchForIdListResponse }
     * 
     */
    public SearchForIdListResponse createSearchForIdListResponse() {
        return new SearchForIdListResponse();
    }

    /**
     * Create an instance of {@link UndoProviderRecordOperation }
     * 
     */
    public UndoProviderRecordOperation createUndoProviderRecordOperation() {
        return new UndoProviderRecordOperation();
    }

    /**
     * Create an instance of {@link CredentialId }
     * 
     */
    public CredentialId createCredentialId() {
        return new CredentialId();
    }

    /**
     * Create an instance of {@link UndoClientRecordOperation }
     * 
     */
    public UndoClientRecordOperation createUndoClientRecordOperation() {
        return new UndoClientRecordOperation();
    }

    /**
     * Create an instance of {@link SearchClientListAsId }
     * 
     */
    public SearchClientListAsId createSearchClientListAsId() {
        return new SearchClientListAsId();
    }

    /**
     * Create an instance of {@link UpdateClientWithOptions }
     * 
     */
    public UpdateClientWithOptions createUpdateClientWithOptions() {
        return new UpdateClientWithOptions();
    }

    /**
     * Create an instance of {@link UpdateProviderResponse }
     * 
     */
    public UpdateProviderResponse createUpdateProviderResponse() {
        return new UpdateProviderResponse();
    }

    /**
     * Create an instance of {@link ProviderTaskId }
     * 
     */
    public ProviderTaskId createProviderTaskId() {
        return new ProviderTaskId();
    }

    /**
     * Create an instance of {@link CreateCustomProviderTask }
     * 
     */
    public CreateCustomProviderTask createCreateCustomProviderTask() {
        return new CreateCustomProviderTask();
    }

    /**
     * Create an instance of {@link CreateOrUpdateClient }
     * 
     */
    public CreateOrUpdateClient createCreateOrUpdateClient() {
        return new CreateOrUpdateClient();
    }

    /**
     * Create an instance of {@link TextSearchClientListAsId }
     * 
     */
    public TextSearchClientListAsId createTextSearchClientListAsId() {
        return new TextSearchClientListAsId();
    }

    /**
     * Create an instance of {@link UpdateClientResponse }
     * 
     */
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link MarkIdEntityLink }
     * 
     */
    public MarkIdEntityLink createMarkIdEntityLink() {
        return new MarkIdEntityLink();
    }

    /**
     * Create an instance of {@link CompareClientAsIdResponse }
     * 
     */
    public CompareClientAsIdResponse createCompareClientAsIdResponse() {
        return new CompareClientAsIdResponse();
    }

    /**
     * Create an instance of {@link ProviderTextSearchHitResult }
     * 
     */
    public ProviderTextSearchHitResult createProviderTextSearchHitResult() {
        return new ProviderTextSearchHitResult();
    }

    /**
     * Create an instance of {@link MasterDataServiceException }
     * 
     */
    public MasterDataServiceException createMasterDataServiceException() {
        return new MasterDataServiceException();
    }

    /**
     * Create an instance of {@link GetProviderList }
     * 
     */
    public GetProviderList createGetProviderList() {
        return new GetProviderList();
    }

    /**
     * Create an instance of {@link TextSearchForProvList }
     * 
     */
    public TextSearchForProvList createTextSearchForProvList() {
        return new TextSearchForProvList();
    }

    /**
     * Create an instance of {@link TextSearchProviderListAsProv }
     * 
     */
    public TextSearchProviderListAsProv createTextSearchProviderListAsProv() {
        return new TextSearchProviderListAsProv();
    }

    /**
     * Create an instance of {@link AuditData }
     * 
     */
    public AuditData createAuditData() {
        return new AuditData();
    }

    /**
     * Create an instance of {@link CreateOrUpdateProviderWithOptions }
     * 
     */
    public CreateOrUpdateProviderWithOptions createCreateOrUpdateProviderWithOptions() {
        return new CreateOrUpdateProviderWithOptions();
    }

    /**
     * Create an instance of {@link MarkProvEntityLink }
     * 
     */
    public MarkProvEntityLink createMarkProvEntityLink() {
        return new MarkProvEntityLink();
    }

    /**
     * Create an instance of {@link ProviderTextSearchResult }
     * 
     */
    public ProviderTextSearchResult createProviderTextSearchResult() {
        return new ProviderTextSearchResult();
    }

    /**
     * Create an instance of {@link UndoProviderRecordOperationResponse }
     * 
     */
    public UndoProviderRecordOperationResponse createUndoProviderRecordOperationResponse() {
        return new UndoProviderRecordOperationResponse();
    }

    /**
     * Create an instance of {@link DeleteProviderResponse }
     * 
     */
    public DeleteProviderResponse createDeleteProviderResponse() {
        return new DeleteProviderResponse();
    }

    /**
     * Create an instance of {@link GetIdEntityListByIdEntityIdsResponse }
     * 
     */
    public GetIdEntityListByIdEntityIdsResponse createGetIdEntityListByIdEntityIdsResponse() {
        return new GetIdEntityListByIdEntityIdsResponse();
    }

    /**
     * Create an instance of {@link LinkProviderToProvEntity }
     * 
     */
    public LinkProviderToProvEntity createLinkProviderToProvEntity() {
        return new LinkProviderToProvEntity();
    }

    /**
     * Create an instance of {@link UnlinkProviderFromProvEntityResponse }
     * 
     */
    public UnlinkProviderFromProvEntityResponse createUnlinkProviderFromProvEntityResponse() {
        return new UnlinkProviderFromProvEntityResponse();
    }

    /**
     * Create an instance of {@link TextSearchForProvListResponse }
     * 
     */
    public TextSearchForProvListResponse createTextSearchForProvListResponse() {
        return new TextSearchForProvListResponse();
    }

    /**
     * Create an instance of {@link UpdateProviderTask }
     * 
     */
    public UpdateProviderTask createUpdateProviderTask() {
        return new UpdateProviderTask();
    }

    /**
     * Create an instance of {@link UpdateQualifiedProv }
     * 
     */
    public UpdateQualifiedProv createUpdateQualifiedProv() {
        return new UpdateQualifiedProv();
    }

    /**
     * Create an instance of {@link UpdateProviderWithOptionsResponse }
     * 
     */
    public UpdateProviderWithOptionsResponse createUpdateProviderWithOptionsResponse() {
        return new UpdateProviderWithOptionsResponse();
    }

    /**
     * Create an instance of {@link DropClient }
     * 
     */
    public DropClient createDropClient() {
        return new DropClient();
    }

    /**
     * Create an instance of {@link GetIdEntityTask }
     * 
     */
    public GetIdEntityTask createGetIdEntityTask() {
        return new GetIdEntityTask();
    }

    /**
     * Create an instance of {@link GetProviderTaskResponse }
     * 
     */
    public GetProviderTaskResponse createGetProviderTaskResponse() {
        return new GetProviderTaskResponse();
    }

    /**
     * Create an instance of {@link ClientTaskId }
     * 
     */
    public ClientTaskId createClientTaskId() {
        return new ClientTaskId();
    }

    /**
     * Create an instance of {@link ProvEntityTask }
     * 
     */
    public ProvEntityTask createProvEntityTask() {
        return new ProvEntityTask();
    }

    /**
     * Create an instance of {@link ScoreClientAsId }
     * 
     */
    public ScoreClientAsId createScoreClientAsId() {
        return new ScoreClientAsId();
    }

    /**
     * Create an instance of {@link UpdateProvEntityWithOptions }
     * 
     */
    public UpdateProvEntityWithOptions createUpdateProvEntityWithOptions() {
        return new UpdateProvEntityWithOptions();
    }

    /**
     * Create an instance of {@link ScoreClientAsIdResponse }
     * 
     */
    public ScoreClientAsIdResponse createScoreClientAsIdResponse() {
        return new ScoreClientAsIdResponse();
    }

    /**
     * Create an instance of {@link UnmergeProviderResponse }
     * 
     */
    public UnmergeProviderResponse createUnmergeProviderResponse() {
        return new UnmergeProviderResponse();
    }

    /**
     * Create an instance of {@link GetProvEntityListByProvEntityIdsResponse }
     * 
     */
    public GetProvEntityListByProvEntityIdsResponse createGetProvEntityListByProvEntityIdsResponse() {
        return new GetProvEntityListByProvEntityIdsResponse();
    }

    /**
     * Create an instance of {@link CreateClientWithOptionsResponse }
     * 
     */
    public CreateClientWithOptionsResponse createCreateClientWithOptionsResponse() {
        return new CreateClientWithOptionsResponse();
    }

    /**
     * Create an instance of {@link DeleteProvider }
     * 
     */
    public DeleteProvider createDeleteProvider() {
        return new DeleteProvider();
    }

    /**
     * Create an instance of {@link GetProviderTask }
     * 
     */
    public GetProviderTask createGetProviderTask() {
        return new GetProviderTask();
    }

    /**
     * Create an instance of {@link MarkIdEntityLinkResponse }
     * 
     */
    public MarkIdEntityLinkResponse createMarkIdEntityLinkResponse() {
        return new MarkIdEntityLinkResponse();
    }

    /**
     * Create an instance of {@link ProviderSearchResult }
     * 
     */
    public ProviderSearchResult createProviderSearchResult() {
        return new ProviderSearchResult();
    }

    /**
     * Create an instance of {@link UndoClientRecordOperationResponse }
     * 
     */
    public UndoClientRecordOperationResponse createUndoClientRecordOperationResponse() {
        return new UndoClientRecordOperationResponse();
    }

    /**
     * Create an instance of {@link UpdateIdEntityWithOptions }
     * 
     */
    public UpdateIdEntityWithOptions createUpdateIdEntityWithOptions() {
        return new UpdateIdEntityWithOptions();
    }

    /**
     * Create an instance of {@link CreateCustomProviderTaskResponse }
     * 
     */
    public CreateCustomProviderTaskResponse createCreateCustomProviderTaskResponse() {
        return new CreateCustomProviderTaskResponse();
    }

    /**
     * Create an instance of {@link TextSearchProviderListAsProvResponse }
     * 
     */
    public TextSearchProviderListAsProvResponse createTextSearchProviderListAsProvResponse() {
        return new TextSearchProviderListAsProvResponse();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link UpdateProvEntityWithOptionsResponse }
     * 
     */
    public UpdateProvEntityWithOptionsResponse createUpdateProvEntityWithOptionsResponse() {
        return new UpdateProvEntityWithOptionsResponse();
    }

    /**
     * Create an instance of {@link GetProviderListResponse }
     * 
     */
    public GetProviderListResponse createGetProviderListResponse() {
        return new GetProviderListResponse();
    }

    /**
     * Create an instance of {@link CreateOrUpdateClientWithOptions }
     * 
     */
    public CreateOrUpdateClientWithOptions createCreateOrUpdateClientWithOptions() {
        return new CreateOrUpdateClientWithOptions();
    }

    /**
     * Create an instance of {@link UnmergeProvider }
     * 
     */
    public UnmergeProvider createUnmergeProvider() {
        return new UnmergeProvider();
    }

    /**
     * Create an instance of {@link CompareProviderAsProvResponse }
     * 
     */
    public CompareProviderAsProvResponse createCompareProviderAsProvResponse() {
        return new CompareProviderAsProvResponse();
    }

    /**
     * Create an instance of {@link CreateOrUpdateClientResponse }
     * 
     */
    public CreateOrUpdateClientResponse createCreateOrUpdateClientResponse() {
        return new CreateOrUpdateClientResponse();
    }

    /**
     * Create an instance of {@link SearchForProviderTaskByProviderIds }
     * 
     */
    public SearchForProviderTaskByProviderIds createSearchForProviderTaskByProviderIds() {
        return new SearchForProviderTaskByProviderIds();
    }

    /**
     * Create an instance of {@link UpdateProvEntity }
     * 
     */
    public UpdateProvEntity createUpdateProvEntity() {
        return new UpdateProvEntity();
    }

    /**
     * Create an instance of {@link UpdateQualifiedIdWithOptions }
     * 
     */
    public UpdateQualifiedIdWithOptions createUpdateQualifiedIdWithOptions() {
        return new UpdateQualifiedIdWithOptions();
    }

    /**
     * Create an instance of {@link CreateOrUpdateClientWithOptionsResponse }
     * 
     */
    public CreateOrUpdateClientWithOptionsResponse createCreateOrUpdateClientWithOptionsResponse() {
        return new CreateOrUpdateClientWithOptionsResponse();
    }

    /**
     * Create an instance of {@link DropClientResponse }
     * 
     */
    public DropClientResponse createDropClientResponse() {
        return new DropClientResponse();
    }

    /**
     * Create an instance of {@link GetProvEntityListByProvEntityIds }
     * 
     */
    public GetProvEntityListByProvEntityIds createGetProvEntityListByProvEntityIds() {
        return new GetProvEntityListByProvEntityIds();
    }

    /**
     * Create an instance of {@link GetProvEntityTask }
     * 
     */
    public GetProvEntityTask createGetProvEntityTask() {
        return new GetProvEntityTask();
    }

    /**
     * Create an instance of {@link SearchForIdList }
     * 
     */
    public SearchForIdList createSearchForIdList() {
        return new SearchForIdList();
    }

    /**
     * Create an instance of {@link UpdateIdEntityWithOptionsResponse }
     * 
     */
    public UpdateIdEntityWithOptionsResponse createUpdateIdEntityWithOptionsResponse() {
        return new UpdateIdEntityWithOptionsResponse();
    }

    /**
     * Create an instance of {@link ClientRecordTask }
     * 
     */
    public ClientRecordTask createClientRecordTask() {
        return new ClientRecordTask();
    }

    /**
     * Create an instance of {@link UpdateQualifiedIdResponse }
     * 
     */
    public UpdateQualifiedIdResponse createUpdateQualifiedIdResponse() {
        return new UpdateQualifiedIdResponse();
    }

    /**
     * Create an instance of {@link MergeClient }
     * 
     */
    public MergeClient createMergeClient() {
        return new MergeClient();
    }

    /**
     * Create an instance of {@link CreateOrUpdateProviderWithOptionsResponse }
     * 
     */
    public CreateOrUpdateProviderWithOptionsResponse createCreateOrUpdateProviderWithOptionsResponse() {
        return new CreateOrUpdateProviderWithOptionsResponse();
    }

    /**
     * Create an instance of {@link CreateProviderWithOptionsResponse }
     * 
     */
    public CreateProviderWithOptionsResponse createCreateProviderWithOptionsResponse() {
        return new CreateProviderWithOptionsResponse();
    }

    /**
     * Create an instance of {@link GetIdEntityList }
     * 
     */
    public GetIdEntityList createGetIdEntityList() {
        return new GetIdEntityList();
    }

    /**
     * Create an instance of {@link LinkClientToIdEntity }
     * 
     */
    public LinkClientToIdEntity createLinkClientToIdEntity() {
        return new LinkClientToIdEntity();
    }

    /**
     * Create an instance of {@link MarkProvEntityLinkResponse }
     * 
     */
    public MarkProvEntityLinkResponse createMarkProvEntityLinkResponse() {
        return new MarkProvEntityLinkResponse();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link ScoreProviderAsProvResponse }
     * 
     */
    public ScoreProviderAsProvResponse createScoreProviderAsProvResponse() {
        return new ScoreProviderAsProvResponse();
    }

    /**
     * Create an instance of {@link UpdateClientTask }
     * 
     */
    public UpdateClientTask createUpdateClientTask() {
        return new UpdateClientTask();
    }

    /**
     * Create an instance of {@link UpdateProviderTaskResponse }
     * 
     */
    public UpdateProviderTaskResponse createUpdateProviderTaskResponse() {
        return new UpdateProviderTaskResponse();
    }

    /**
     * Create an instance of {@link SearchForProvList }
     * 
     */
    public SearchForProvList createSearchForProvList() {
        return new SearchForProvList();
    }

    /**
     * Create an instance of {@link SearchForProviderTaskByCredentialIdsResponse }
     * 
     */
    public SearchForProviderTaskByCredentialIdsResponse createSearchForProviderTaskByCredentialIdsResponse() {
        return new SearchForProviderTaskByCredentialIdsResponse();
    }

    /**
     * Create an instance of {@link GetProvEntityList }
     * 
     */
    public GetProvEntityList createGetProvEntityList() {
        return new GetProvEntityList();
    }

    /**
     * Create an instance of {@link LinkClientToIdEntityResponse }
     * 
     */
    public LinkClientToIdEntityResponse createLinkClientToIdEntityResponse() {
        return new LinkClientToIdEntityResponse();
    }

    /**
     * Create an instance of {@link UnmergeClientResponse }
     * 
     */
    public UnmergeClientResponse createUnmergeClientResponse() {
        return new UnmergeClientResponse();
    }

    /**
     * Create an instance of {@link SearchForClientTaskByCredentialIds }
     * 
     */
    public SearchForClientTaskByCredentialIds createSearchForClientTaskByCredentialIds() {
        return new SearchForClientTaskByCredentialIds();
    }

    /**
     * Create an instance of {@link GetProvEntityTaskResponse }
     * 
     */
    public GetProvEntityTaskResponse createGetProvEntityTaskResponse() {
        return new GetProvEntityTaskResponse();
    }

    /**
     * Create an instance of {@link UpdateQualifiedId }
     * 
     */
    public UpdateQualifiedId createUpdateQualifiedId() {
        return new UpdateQualifiedId();
    }

    /**
     * Create an instance of {@link UndeleteProviderResponse }
     * 
     */
    public UndeleteProviderResponse createUndeleteProviderResponse() {
        return new UndeleteProviderResponse();
    }

    /**
     * Create an instance of {@link CompareClientAsId }
     * 
     */
    public CompareClientAsId createCompareClientAsId() {
        return new CompareClientAsId();
    }

    /**
     * Create an instance of {@link TextSearchForTermListResponse }
     * 
     */
    public TextSearchForTermListResponse createTextSearchForTermListResponse() {
        return new TextSearchForTermListResponse();
    }

    /**
     * Create an instance of {@link ClientSearchResult }
     * 
     */
    public ClientSearchResult createClientSearchResult() {
        return new ClientSearchResult();
    }

    /**
     * Create an instance of {@link SearchForProviderTaskByProviderIdsResponse }
     * 
     */
    public SearchForProviderTaskByProviderIdsResponse createSearchForProviderTaskByProviderIdsResponse() {
        return new SearchForProviderTaskByProviderIdsResponse();
    }

    /**
     * Create an instance of {@link UpdateClient }
     * 
     */
    public UpdateClient createUpdateClient() {
        return new UpdateClient();
    }

    /**
     * Create an instance of {@link ProviderRecordTask }
     * 
     */
    public ProviderRecordTask createProviderRecordTask() {
        return new ProviderRecordTask();
    }

    /**
     * Create an instance of {@link CreateProviderWithOptions }
     * 
     */
    public CreateProviderWithOptions createCreateProviderWithOptions() {
        return new CreateProviderWithOptions();
    }

    /**
     * Create an instance of {@link UpdateQualifiedProvWithOptionsResponse }
     * 
     */
    public UpdateQualifiedProvWithOptionsResponse createUpdateQualifiedProvWithOptionsResponse() {
        return new UpdateQualifiedProvWithOptionsResponse();
    }

    /**
     * Create an instance of {@link IdEntitySearchResult }
     * 
     */
    public IdEntitySearchResult createIdEntitySearchResult() {
        return new IdEntitySearchResult();
    }

    /**
     * Create an instance of {@link SearchForClientTaskByClientIdsResponse }
     * 
     */
    public SearchForClientTaskByClientIdsResponse createSearchForClientTaskByClientIdsResponse() {
        return new SearchForClientTaskByClientIdsResponse();
    }

    /**
     * Create an instance of {@link GetIdEntityListByIdEntityIds }
     * 
     */
    public GetIdEntityListByIdEntityIds createGetIdEntityListByIdEntityIds() {
        return new GetIdEntityListByIdEntityIds();
    }

    /**
     * Create an instance of {@link GetProvEntityListResponse }
     * 
     */
    public GetProvEntityListResponse createGetProvEntityListResponse() {
        return new GetProvEntityListResponse();
    }

    /**
     * Create an instance of {@link TextSearchClientListAsIdResponse }
     * 
     */
    public TextSearchClientListAsIdResponse createTextSearchClientListAsIdResponse() {
        return new TextSearchClientListAsIdResponse();
    }

    /**
     * Create an instance of {@link UnlinkClientFromIdEntityResponse }
     * 
     */
    public UnlinkClientFromIdEntityResponse createUnlinkClientFromIdEntityResponse() {
        return new UnlinkClientFromIdEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateClientTaskResponse }
     * 
     */
    public UpdateClientTaskResponse createUpdateClientTaskResponse() {
        return new UpdateClientTaskResponse();
    }

    /**
     * Create an instance of {@link TermSearchResult }
     * 
     */
    public TermSearchResult createTermSearchResult() {
        return new TermSearchResult();
    }

    /**
     * Create an instance of {@link GetIdEntityListResponse }
     * 
     */
    public GetIdEntityListResponse createGetIdEntityListResponse() {
        return new GetIdEntityListResponse();
    }

    /**
     * Create an instance of {@link SearchProviderListAsProv }
     * 
     */
    public SearchProviderListAsProv createSearchProviderListAsProv() {
        return new SearchProviderListAsProv();
    }

    /**
     * Create an instance of {@link DropProviderResponse }
     * 
     */
    public DropProviderResponse createDropProviderResponse() {
        return new DropProviderResponse();
    }

    /**
     * Create an instance of {@link GetClientTaskResponse }
     * 
     */
    public GetClientTaskResponse createGetClientTaskResponse() {
        return new GetClientTaskResponse();
    }

    /**
     * Create an instance of {@link UpdateProvider }
     * 
     */
    public UpdateProvider createUpdateProvider() {
        return new UpdateProvider();
    }

    /**
     * Create an instance of {@link UndeleteClientResponse }
     * 
     */
    public UndeleteClientResponse createUndeleteClientResponse() {
        return new UndeleteClientResponse();
    }

    /**
     * Create an instance of {@link UnlinkProviderFromProvEntity }
     * 
     */
    public UnlinkProviderFromProvEntity createUnlinkProviderFromProvEntity() {
        return new UnlinkProviderFromProvEntity();
    }

    /**
     * Create an instance of {@link CreateClientResponse }
     * 
     */
    public CreateClientResponse createCreateClientResponse() {
        return new CreateClientResponse();
    }

    /**
     * Create an instance of {@link ClientCustomTask }
     * 
     */
    public ClientCustomTask createClientCustomTask() {
        return new ClientCustomTask();
    }

    /**
     * Create an instance of {@link CreateCustomClientTask }
     * 
     */
    public CreateCustomClientTask createCreateCustomClientTask() {
        return new CreateCustomClientTask();
    }

    /**
     * Create an instance of {@link UnlinkClientFromIdEntity }
     * 
     */
    public UnlinkClientFromIdEntity createUnlinkClientFromIdEntity() {
        return new UnlinkClientFromIdEntity();
    }

    /**
     * Create an instance of {@link CreateOrUpdateProvider }
     * 
     */
    public CreateOrUpdateProvider createCreateOrUpdateProvider() {
        return new CreateOrUpdateProvider();
    }

    /**
     * Create an instance of {@link SearchForClientTaskByClientIds }
     * 
     */
    public SearchForClientTaskByClientIds createSearchForClientTaskByClientIds() {
        return new SearchForClientTaskByClientIds();
    }

    /**
     * Create an instance of {@link UpdateIdEntityResponse }
     * 
     */
    public UpdateIdEntityResponse createUpdateIdEntityResponse() {
        return new UpdateIdEntityResponse();
    }

    /**
     * Create an instance of {@link ScoreProviderAsProv }
     * 
     */
    public ScoreProviderAsProv createScoreProviderAsProv() {
        return new ScoreProviderAsProv();
    }

    /**
     * Create an instance of {@link TextSearchForIdListResponse }
     * 
     */
    public TextSearchForIdListResponse createTextSearchForIdListResponse() {
        return new TextSearchForIdListResponse();
    }

    /**
     * Create an instance of {@link UpdateQualifiedIdWithOptionsResponse }
     * 
     */
    public UpdateQualifiedIdWithOptionsResponse createUpdateQualifiedIdWithOptionsResponse() {
        return new UpdateQualifiedIdWithOptionsResponse();
    }

    /**
     * Create an instance of {@link ClientTextSearchHitResult }
     * 
     */
    public ClientTextSearchHitResult createClientTextSearchHitResult() {
        return new ClientTextSearchHitResult();
    }

    /**
     * Create an instance of {@link UpdateIdEntity }
     * 
     */
    public UpdateIdEntity createUpdateIdEntity() {
        return new UpdateIdEntity();
    }

    /**
     * Create an instance of {@link UpdateProvEntityResponse }
     * 
     */
    public UpdateProvEntityResponse createUpdateProvEntityResponse() {
        return new UpdateProvEntityResponse();
    }

    /**
     * Create an instance of {@link GetIdEntityTaskResponse }
     * 
     */
    public GetIdEntityTaskResponse createGetIdEntityTaskResponse() {
        return new GetIdEntityTaskResponse();
    }

    /**
     * Create an instance of {@link LinkProviderToProvEntityResponse }
     * 
     */
    public LinkProviderToProvEntityResponse createLinkProviderToProvEntityResponse() {
        return new LinkProviderToProvEntityResponse();
    }

    /**
     * Create an instance of {@link TextSearchForIdList }
     * 
     */
    public TextSearchForIdList createTextSearchForIdList() {
        return new TextSearchForIdList();
    }

    /**
     * Create an instance of {@link SearchForClientTaskByCredentialIdsResponse }
     * 
     */
    public SearchForClientTaskByCredentialIdsResponse createSearchForClientTaskByCredentialIdsResponse() {
        return new SearchForClientTaskByCredentialIdsResponse();
    }

    /**
     * Create an instance of {@link UndeleteClient }
     * 
     */
    public UndeleteClient createUndeleteClient() {
        return new UndeleteClient();
    }

    /**
     * Create an instance of {@link CreateOrUpdateProviderResponse }
     * 
     */
    public CreateOrUpdateProviderResponse createCreateOrUpdateProviderResponse() {
        return new CreateOrUpdateProviderResponse();
    }

    /**
     * Create an instance of {@link SearchForProviderTaskByCredentialIds }
     * 
     */
    public SearchForProviderTaskByCredentialIds createSearchForProviderTaskByCredentialIds() {
        return new SearchForProviderTaskByCredentialIds();
    }

    /**
     * Create an instance of {@link UpdateClientWithOptionsResponse }
     * 
     */
    public UpdateClientWithOptionsResponse createUpdateClientWithOptionsResponse() {
        return new UpdateClientWithOptionsResponse();
    }

    /**
     * Create an instance of {@link CreateCustomClientTaskResponse }
     * 
     */
    public CreateCustomClientTaskResponse createCreateCustomClientTaskResponse() {
        return new CreateCustomClientTaskResponse();
    }

    /**
     * Create an instance of {@link GetClientListResponse }
     * 
     */
    public GetClientListResponse createGetClientListResponse() {
        return new GetClientListResponse();
    }

    /**
     * Create an instance of {@link Memprovste }
     * 
     */
    public Memprovste createMemprovste() {
        return new Memprovste();
    }

    /**
     * Create an instance of {@link ClientId }
     * 
     */
    public ClientId createClientId() {
        return new ClientId();
    }

    /**
     * Create an instance of {@link Memident }
     * 
     */
    public Memident createMemident() {
        return new Memident();
    }

    /**
     * Create an instance of {@link Memphone }
     * 
     */
    public Memphone createMemphone() {
        return new Memphone();
    }

    /**
     * Create an instance of {@link Memenum }
     * 
     */
    public Memenum createMemenum() {
        return new Memenum();
    }

    /**
     * Create an instance of {@link ProviderId }
     * 
     */
    public ProviderId createProviderId() {
        return new ProviderId();
    }

    /**
     * Create an instance of {@link CreateUpdateOptions }
     * 
     */
    public CreateUpdateOptions createCreateUpdateOptions() {
        return new CreateUpdateOptions();
    }

    /**
     * Create an instance of {@link TaskId }
     * 
     */
    public TaskId createTaskId() {
        return new TaskId();
    }

    /**
     * Create an instance of {@link Memlgaddr }
     * 
     */
    public Memlgaddr createMemlgaddr() {
        return new Memlgaddr();
    }

    /**
     * Create an instance of {@link Memprovctnt }
     * 
     */
    public Memprovctnt createMemprovctnt() {
        return new Memprovctnt();
    }

    /**
     * Create an instance of {@link Membigattr }
     * 
     */
    public Membigattr createMembigattr() {
        return new Membigattr();
    }

    /**
     * Create an instance of {@link Memlngnm }
     * 
     */
    public Memlngnm createMemlngnm() {
        return new Memlngnm();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link Memprovphn }
     * 
     */
    public Memprovphn createMemprovphn() {
        return new Memprovphn();
    }

    /**
     * Create an instance of {@link Memlanguage }
     * 
     */
    public Memlanguage createMemlanguage() {
        return new Memlanguage();
    }

    /**
     * Create an instance of {@link ProvEntityId }
     * 
     */
    public ProvEntityId createProvEntityId() {
        return new ProvEntityId();
    }

    /**
     * Create an instance of {@link Memdate }
     * 
     */
    public Memdate createMemdate() {
        return new Memdate();
    }

    /**
     * Create an instance of {@link Memstesvcprg }
     * 
     */
    public Memstesvcprg createMemstesvcprg() {
        return new Memstesvcprg();
    }

    /**
     * Create an instance of {@link Memprogram }
     * 
     */
    public Memprogram createMemprogram() {
        return new Memprogram();
    }

    /**
     * Create an instance of {@link Memprovprog }
     * 
     */
    public Memprovprog createMemprovprog() {
        return new Memprovprog();
    }

    /**
     * Create an instance of {@link Memattr }
     * 
     */
    public Memattr createMemattr() {
        return new Memattr();
    }

    /**
     * Create an instance of {@link Memaddr }
     * 
     */
    public Memaddr createMemaddr() {
        return new Memaddr();
    }

    /**
     * Create an instance of {@link Memdisabilit }
     * 
     */
    public Memdisabilit createMemdisabilit() {
        return new Memdisabilit();
    }

    /**
     * Create an instance of {@link Mememcntct }
     * 
     */
    public Mememcntct createMememcntct() {
        return new Mememcntct();
    }

    /**
     * Create an instance of {@link IdEntityId }
     * 
     */
    public IdEntityId createIdEntityId() {
        return new IdEntityId();
    }

    /**
     * Create an instance of {@link com.initiate.client.TextSearchHitResult.StoredValues.Entry }
     * 
     */
    public com.initiate.client.TextSearchHitResult.StoredValues.Entry createTextSearchHitResultStoredValuesEntry() {
        return new com.initiate.client.TextSearchHitResult.StoredValues.Entry();
    }

    /**
     * Create an instance of {@link ClientTask.RelatedClientList }
     * 
     */
    public ClientTask.RelatedClientList createClientTaskRelatedClientList() {
        return new ClientTask.RelatedClientList();
    }

    /**
     * Create an instance of {@link ProviderTask.RelatedProviderList }
     * 
     */
    public ProviderTask.RelatedProviderList createProviderTaskRelatedProviderList() {
        return new ProviderTask.RelatedProviderList();
    }

    /**
     * Create an instance of {@link ProvEntity.ProviderIdList }
     * 
     */
    public ProvEntity.ProviderIdList createProvEntityProviderIdList() {
        return new ProvEntity.ProviderIdList();
    }

    /**
     * Create an instance of {@link Client.AB109FlagList }
     * 
     */
    public Client.AB109FlagList createClientAB109FlagList() {
        return new Client.AB109FlagList();
    }

    /**
     * Create an instance of {@link Client.AliasList }
     * 
     */
    public Client.AliasList createClientAliasList() {
        return new Client.AliasList();
    }

    /**
     * Create an instance of {@link Client.AlienRegistrationNumberList }
     * 
     */
    public Client.AlienRegistrationNumberList createClientAlienRegistrationNumberList() {
        return new Client.AlienRegistrationNumberList();
    }

    /**
     * Create an instance of {@link Client.AlternateEmailList }
     * 
     */
    public Client.AlternateEmailList createClientAlternateEmailList() {
        return new Client.AlternateEmailList();
    }

    /**
     * Create an instance of {@link Client.AlternateMobilePhoneList }
     * 
     */
    public Client.AlternateMobilePhoneList createClientAlternateMobilePhoneList() {
        return new Client.AlternateMobilePhoneList();
    }

    /**
     * Create an instance of {@link Client.CaseManagerList }
     * 
     */
    public Client.CaseManagerList createClientCaseManagerList() {
        return new Client.CaseManagerList();
    }

    /**
     * Create an instance of {@link Client.ChildDueDateList }
     * 
     */
    public Client.ChildDueDateList createClientChildDueDateList() {
        return new Client.ChildDueDateList();
    }

    /**
     * Create an instance of {@link Client.CircumstancesofDeathList }
     * 
     */
    public Client.CircumstancesofDeathList createClientCircumstancesofDeathList() {
        return new Client.CircumstancesofDeathList();
    }

    /**
     * Create an instance of {@link Client.CitizenshipList }
     * 
     */
    public Client.CitizenshipList createClientCitizenshipList() {
        return new Client.CitizenshipList();
    }

    /**
     * Create an instance of {@link Client.ClientNameList }
     * 
     */
    public Client.ClientNameList createClientClientNameList() {
        return new Client.ClientNameList();
    }

    /**
     * Create an instance of {@link Client.ClientNameSuffixList }
     * 
     */
    public Client.ClientNameSuffixList createClientClientNameSuffixList() {
        return new Client.ClientNameSuffixList();
    }

    /**
     * Create an instance of {@link Client.ClientNameTitleList }
     * 
     */
    public Client.ClientNameTitleList createClientClientNameTitleList() {
        return new Client.ClientNameTitleList();
    }

    /**
     * Create an instance of {@link Client.ContactTypeDescriptionList }
     * 
     */
    public Client.ContactTypeDescriptionList createClientContactTypeDescriptionList() {
        return new Client.ContactTypeDescriptionList();
    }

    /**
     * Create an instance of {@link Client.ContactTypeList }
     * 
     */
    public Client.ContactTypeList createClientContactTypeList() {
        return new Client.ContactTypeList();
    }

    /**
     * Create an instance of {@link Client.ContactUsageList }
     * 
     */
    public Client.ContactUsageList createClientContactUsageList() {
        return new Client.ContactUsageList();
    }

    /**
     * Create an instance of {@link Client.CurrentLivingArrangementsList }
     * 
     */
    public Client.CurrentLivingArrangementsList createClientCurrentLivingArrangementsList() {
        return new Client.CurrentLivingArrangementsList();
    }

    /**
     * Create an instance of {@link Client.CurrentWorkExperienceList }
     * 
     */
    public Client.CurrentWorkExperienceList createClientCurrentWorkExperienceList() {
        return new Client.CurrentWorkExperienceList();
    }

    /**
     * Create an instance of {@link Client.DateLastWorkedList }
     * 
     */
    public Client.DateLastWorkedList createClientDateLastWorkedList() {
        return new Client.DateLastWorkedList();
    }

    /**
     * Create an instance of {@link Client.DateofBirthList }
     * 
     */
    public Client.DateofBirthList createClientDateofBirthList() {
        return new Client.DateofBirthList();
    }

    /**
     * Create an instance of {@link Client.DateofDeathList }
     * 
     */
    public Client.DateofDeathList createClientDateofDeathList() {
        return new Client.DateofDeathList();
    }

    /**
     * Create an instance of {@link Client.DisabilityList }
     * 
     */
    public Client.DisabilityList createClientDisabilityList() {
        return new Client.DisabilityList();
    }

    /**
     * Create an instance of {@link Client.EducationLevelList }
     * 
     */
    public Client.EducationLevelList createClientEducationLevelList() {
        return new Client.EducationLevelList();
    }

    /**
     * Create an instance of {@link Client.EmergencyContactList }
     * 
     */
    public Client.EmergencyContactList createClientEmergencyContactList() {
        return new Client.EmergencyContactList();
    }

    /**
     * Create an instance of {@link Client.EmploymentStatusList }
     * 
     */
    public Client.EmploymentStatusList createClientEmploymentStatusList() {
        return new Client.EmploymentStatusList();
    }

    /**
     * Create an instance of {@link Client.EnrolledInJobTrainingList }
     * 
     */
    public Client.EnrolledInJobTrainingList createClientEnrolledInJobTrainingList() {
        return new Client.EnrolledInJobTrainingList();
    }

    /**
     * Create an instance of {@link Client.EnrolledinSchoolList }
     * 
     */
    public Client.EnrolledinSchoolList createClientEnrolledinSchoolList() {
        return new Client.EnrolledinSchoolList();
    }

    /**
     * Create an instance of {@link Client.EthnicityList }
     * 
     */
    public Client.EthnicityList createClientEthnicityList() {
        return new Client.EthnicityList();
    }

    /**
     * Create an instance of {@link Client.ForeignAddressList }
     * 
     */
    public Client.ForeignAddressList createClientForeignAddressList() {
        return new Client.ForeignAddressList();
    }

    /**
     * Create an instance of {@link Client.GenderList }
     * 
     */
    public Client.GenderList createClientGenderList() {
        return new Client.GenderList();
    }

    /**
     * Create an instance of {@link Client.GraduatedFromHighSchoolList }
     * 
     */
    public Client.GraduatedFromHighSchoolList createClientGraduatedFromHighSchoolList() {
        return new Client.GraduatedFromHighSchoolList();
    }

    /**
     * Create an instance of {@link Client.HistoryofSelfInjuryList }
     * 
     */
    public Client.HistoryofSelfInjuryList createClientHistoryofSelfInjuryList() {
        return new Client.HistoryofSelfInjuryList();
    }

    /**
     * Create an instance of {@link Client.HistoryofViolenceList }
     * 
     */
    public Client.HistoryofViolenceList createClientHistoryofViolenceList() {
        return new Client.HistoryofViolenceList();
    }

    /**
     * Create an instance of {@link Client.HomeAddressList }
     * 
     */
    public Client.HomeAddressList createClientHomeAddressList() {
        return new Client.HomeAddressList();
    }

    /**
     * Create an instance of {@link Client.HomeEmailList }
     * 
     */
    public Client.HomeEmailList createClientHomeEmailList() {
        return new Client.HomeEmailList();
    }

    /**
     * Create an instance of {@link Client.HomeFaxList }
     * 
     */
    public Client.HomeFaxList createClientHomeFaxList() {
        return new Client.HomeFaxList();
    }

    /**
     * Create an instance of {@link Client.HomePhoneList }
     * 
     */
    public Client.HomePhoneList createClientHomePhoneList() {
        return new Client.HomePhoneList();
    }

    /**
     * Create an instance of {@link Client.ImmigrationStatusList }
     * 
     */
    public Client.ImmigrationStatusList createClientImmigrationStatusList() {
        return new Client.ImmigrationStatusList();
    }

    /**
     * Create an instance of {@link Client.InterpreterList }
     * 
     */
    public Client.InterpreterList createClientInterpreterList() {
        return new Client.InterpreterList();
    }

    /**
     * Create an instance of {@link Client.IsSecuredList }
     * 
     */
    public Client.IsSecuredList createClientIsSecuredList() {
        return new Client.IsSecuredList();
    }

    /**
     * Create an instance of {@link Client.IsSecuredReasonList }
     * 
     */
    public Client.IsSecuredReasonList createClientIsSecuredReasonList() {
        return new Client.IsSecuredReasonList();
    }

    /**
     * Create an instance of {@link Client.Last4SSNList }
     * 
     */
    public Client.Last4SSNList createClientLast4SSNList() {
        return new Client.Last4SSNList();
    }

    /**
     * Create an instance of {@link Client.LastUpdateList }
     * 
     */
    public Client.LastUpdateList createClientLastUpdateList() {
        return new Client.LastUpdateList();
    }

    /**
     * Create an instance of {@link Client.LiterateList }
     * 
     */
    public Client.LiterateList createClientLiterateList() {
        return new Client.LiterateList();
    }

    /**
     * Create an instance of {@link Client.LivesAtPrimaryAddressList }
     * 
     */
    public Client.LivesAtPrimaryAddressList createClientLivesAtPrimaryAddressList() {
        return new Client.LivesAtPrimaryAddressList();
    }

    /**
     * Create an instance of {@link Client.LivesWithRelationList }
     * 
     */
    public Client.LivesWithRelationList createClientLivesWithRelationList() {
        return new Client.LivesWithRelationList();
    }

    /**
     * Create an instance of {@link Client.MailingAddressList }
     * 
     */
    public Client.MailingAddressList createClientMailingAddressList() {
        return new Client.MailingAddressList();
    }

    /**
     * Create an instance of {@link Client.MaritalStatList }
     * 
     */
    public Client.MaritalStatList createClientMaritalStatList() {
        return new Client.MaritalStatList();
    }

    /**
     * Create an instance of {@link Client.MaritalStatusList }
     * 
     */
    public Client.MaritalStatusList createClientMaritalStatusList() {
        return new Client.MaritalStatusList();
    }

    /**
     * Create an instance of {@link Client.MilitaryStatusList }
     * 
     */
    public Client.MilitaryStatusList createClientMilitaryStatusList() {
        return new Client.MilitaryStatusList();
    }

    /**
     * Create an instance of {@link Client.MobilePhoneList }
     * 
     */
    public Client.MobilePhoneList createClientMobilePhoneList() {
        return new Client.MobilePhoneList();
    }

    /**
     * Create an instance of {@link Client.NameTypeList }
     * 
     */
    public Client.NameTypeList createClientNameTypeList() {
        return new Client.NameTypeList();
    }

    /**
     * Create an instance of {@link Client.NbrChildrenUnder18List }
     * 
     */
    public Client.NbrChildrenUnder18List createClientNbrChildrenUnder18List() {
        return new Client.NbrChildrenUnder18List();
    }

    /**
     * Create an instance of {@link Client.NbrChildrenUnder5List }
     * 
     */
    public Client.NbrChildrenUnder5List createClientNbrChildrenUnder5List() {
        return new Client.NbrChildrenUnder5List();
    }

    /**
     * Create an instance of {@link Client.OtherAddressList }
     * 
     */
    public Client.OtherAddressList createClientOtherAddressList() {
        return new Client.OtherAddressList();
    }

    /**
     * Create an instance of {@link Client.OtherPhoneList }
     * 
     */
    public Client.OtherPhoneList createClientOtherPhoneList() {
        return new Client.OtherPhoneList();
    }

    /**
     * Create an instance of {@link Client.PaidDaysLast30List }
     * 
     */
    public Client.PaidDaysLast30List createClientPaidDaysLast30List() {
        return new Client.PaidDaysLast30List();
    }

    /**
     * Create an instance of {@link Client.PartyIdentifierList }
     * 
     */
    public Client.PartyIdentifierList createClientPartyIdentifierList() {
        return new Client.PartyIdentifierList();
    }

    /**
     * Create an instance of {@link Client.PartyIdentifierTypeList }
     * 
     */
    public Client.PartyIdentifierTypeList createClientPartyIdentifierTypeList() {
        return new Client.PartyIdentifierTypeList();
    }

    /**
     * Create an instance of {@link Client.PersonalAddressList }
     * 
     */
    public Client.PersonalAddressList createClientPersonalAddressList() {
        return new Client.PersonalAddressList();
    }

    /**
     * Create an instance of {@link Client.PopulationTypeList }
     * 
     */
    public Client.PopulationTypeList createClientPopulationTypeList() {
        return new Client.PopulationTypeList();
    }

    /**
     * Create an instance of {@link Client.PostalAddressList }
     * 
     */
    public Client.PostalAddressList createClientPostalAddressList() {
        return new Client.PostalAddressList();
    }

    /**
     * Create an instance of {@link Client.PregnancyStatusList }
     * 
     */
    public Client.PregnancyStatusList createClientPregnancyStatusList() {
        return new Client.PregnancyStatusList();
    }

    /**
     * Create an instance of {@link Client.PrimacyList }
     * 
     */
    public Client.PrimacyList createClientPrimacyList() {
        return new Client.PrimacyList();
    }

    /**
     * Create an instance of {@link Client.PrimaryEmailAddressList }
     * 
     */
    public Client.PrimaryEmailAddressList createClientPrimaryEmailAddressList() {
        return new Client.PrimaryEmailAddressList();
    }

    /**
     * Create an instance of {@link Client.PrimaryLanguageList }
     * 
     */
    public Client.PrimaryLanguageList createClientPrimaryLanguageList() {
        return new Client.PrimaryLanguageList();
    }

    /**
     * Create an instance of {@link Client.PrimaryMobilePhoneList }
     * 
     */
    public Client.PrimaryMobilePhoneList createClientPrimaryMobilePhoneList() {
        return new Client.PrimaryMobilePhoneList();
    }

    /**
     * Create an instance of {@link Client.PrivilegedRecordList }
     * 
     */
    public Client.PrivilegedRecordList createClientPrivilegedRecordList() {
        return new Client.PrivilegedRecordList();
    }

    /**
     * Create an instance of {@link Client.ProgramParticipationList }
     * 
     */
    public Client.ProgramParticipationList createClientProgramParticipationList() {
        return new Client.ProgramParticipationList();
    }

    /**
     * Create an instance of {@link Client.RentOrOwnList }
     * 
     */
    public Client.RentOrOwnList createClientRentOrOwnList() {
        return new Client.RentOrOwnList();
    }

    /**
     * Create an instance of {@link Client.ResidenceTypeList }
     * 
     */
    public Client.ResidenceTypeList createClientResidenceTypeList() {
        return new Client.ResidenceTypeList();
    }

    /**
     * Create an instance of {@link Client.ResidentialAddressList }
     * 
     */
    public Client.ResidentialAddressList createClientResidentialAddressList() {
        return new Client.ResidentialAddressList();
    }

    /**
     * Create an instance of {@link Client.ResidentialStatusList }
     * 
     */
    public Client.ResidentialStatusList createClientResidentialStatusList() {
        return new Client.ResidentialStatusList();
    }

    /**
     * Create an instance of {@link Client.RoleStatusList }
     * 
     */
    public Client.RoleStatusList createClientRoleStatusList() {
        return new Client.RoleStatusList();
    }

    /**
     * Create an instance of {@link Client.RoleStatusReasonList }
     * 
     */
    public Client.RoleStatusReasonList createClientRoleStatusReasonList() {
        return new Client.RoleStatusReasonList();
    }

    /**
     * Create an instance of {@link Client.SSNList }
     * 
     */
    public Client.SSNList createClientSSNList() {
        return new Client.SSNList();
    }

    /**
     * Create an instance of {@link Client.SchoolNameList }
     * 
     */
    public Client.SchoolNameList createClientSchoolNameList() {
        return new Client.SchoolNameList();
    }

    /**
     * Create an instance of {@link Client.SecondaryLanguageList }
     * 
     */
    public Client.SecondaryLanguageList createClientSecondaryLanguageList() {
        return new Client.SecondaryLanguageList();
    }

    /**
     * Create an instance of {@link Client.ServiceStreamList }
     * 
     */
    public Client.ServiceStreamList createClientServiceStreamList() {
        return new Client.ServiceStreamList();
    }

    /**
     * Create an instance of {@link Client.SpokenLanguageList }
     * 
     */
    public Client.SpokenLanguageList createClientSpokenLanguageList() {
        return new Client.SpokenLanguageList();
    }

    /**
     * Create an instance of {@link Client.StatusofCitizenshipList }
     * 
     */
    public Client.StatusofCitizenshipList createClientStatusofCitizenshipList() {
        return new Client.StatusofCitizenshipList();
    }

    /**
     * Create an instance of {@link Client.TribeList }
     * 
     */
    public Client.TribeList createClientTribeList() {
        return new Client.TribeList();
    }

    /**
     * Create an instance of {@link Client.VeteranStatusList }
     * 
     */
    public Client.VeteranStatusList createClientVeteranStatusList() {
        return new Client.VeteranStatusList();
    }

    /**
     * Create an instance of {@link Client.VisaTypeList }
     * 
     */
    public Client.VisaTypeList createClientVisaTypeList() {
        return new Client.VisaTypeList();
    }

    /**
     * Create an instance of {@link Client.WorkAddressList }
     * 
     */
    public Client.WorkAddressList createClientWorkAddressList() {
        return new Client.WorkAddressList();
    }

    /**
     * Create an instance of {@link Client.WorkEmailList }
     * 
     */
    public Client.WorkEmailList createClientWorkEmailList() {
        return new Client.WorkEmailList();
    }

    /**
     * Create an instance of {@link Client.WorkFaxList }
     * 
     */
    public Client.WorkFaxList createClientWorkFaxList() {
        return new Client.WorkFaxList();
    }

    /**
     * Create an instance of {@link Client.WorkPhoneList }
     * 
     */
    public Client.WorkPhoneList createClientWorkPhoneList() {
        return new Client.WorkPhoneList();
    }

    /**
     * Create an instance of {@link Provider.ProviderAKAList }
     * 
     */
    public Provider.ProviderAKAList createProviderProviderAKAList() {
        return new Provider.ProviderAKAList();
    }

    /**
     * Create an instance of {@link Provider.ProviderAvailableforDirectoryList }
     * 
     */
    public Provider.ProviderAvailableforDirectoryList createProviderProviderAvailableforDirectoryList() {
        return new Provider.ProviderAvailableforDirectoryList();
    }

    /**
     * Create an instance of {@link Provider.ProviderBusServiceAccessList }
     * 
     */
    public Provider.ProviderBusServiceAccessList createProviderProviderBusServiceAccessList() {
        return new Provider.ProviderBusServiceAccessList();
    }

    /**
     * Create an instance of {@link Provider.ProviderContactList }
     * 
     */
    public Provider.ProviderContactList createProviderProviderContactList() {
        return new Provider.ProviderContactList();
    }

    /**
     * Create an instance of {@link Provider.ProviderDescriptionList }
     * 
     */
    public Provider.ProviderDescriptionList createProviderProviderDescriptionList() {
        return new Provider.ProviderDescriptionList();
    }

    /**
     * Create an instance of {@link Provider.ProviderDisabilityAccessList }
     * 
     */
    public Provider.ProviderDisabilityAccessList createProviderProviderDisabilityAccessList() {
        return new Provider.ProviderDisabilityAccessList();
    }

    /**
     * Create an instance of {@link Provider.ProviderEmailAddressList }
     * 
     */
    public Provider.ProviderEmailAddressList createProviderProviderEmailAddressList() {
        return new Provider.ProviderEmailAddressList();
    }

    /**
     * Create an instance of {@link Provider.ProviderLastUpdateDateTimeList }
     * 
     */
    public Provider.ProviderLastUpdateDateTimeList createProviderProviderLastUpdateDateTimeList() {
        return new Provider.ProviderLastUpdateDateTimeList();
    }

    /**
     * Create an instance of {@link Provider.ProviderMailingAddressList }
     * 
     */
    public Provider.ProviderMailingAddressList createProviderProviderMailingAddressList() {
        return new Provider.ProviderMailingAddressList();
    }

    /**
     * Create an instance of {@link Provider.ProviderNameList }
     * 
     */
    public Provider.ProviderNameList createProviderProviderNameList() {
        return new Provider.ProviderNameList();
    }

    /**
     * Create an instance of {@link Provider.ProviderPhoneList }
     * 
     */
    public Provider.ProviderPhoneList createProviderProviderPhoneList() {
        return new Provider.ProviderPhoneList();
    }

    /**
     * Create an instance of {@link Provider.ProviderPhysicalAddressList }
     * 
     */
    public Provider.ProviderPhysicalAddressList createProviderProviderPhysicalAddressList() {
        return new Provider.ProviderPhysicalAddressList();
    }

    /**
     * Create an instance of {@link Provider.ProviderProgramList }
     * 
     */
    public Provider.ProviderProgramList createProviderProviderProgramList() {
        return new Provider.ProviderProgramList();
    }

    /**
     * Create an instance of {@link Provider.ProviderSiteList }
     * 
     */
    public Provider.ProviderSiteList createProviderProviderSiteList() {
        return new Provider.ProviderSiteList();
    }

    /**
     * Create an instance of {@link Provider.ProviderSiteServicesProgramList }
     * 
     */
    public Provider.ProviderSiteServicesProgramList createProviderProviderSiteServicesProgramList() {
        return new Provider.ProviderSiteServicesProgramList();
    }

    /**
     * Create an instance of {@link Provider.ProviderWebAddressList }
     * 
     */
    public Provider.ProviderWebAddressList createProviderProviderWebAddressList() {
        return new Provider.ProviderWebAddressList();
    }

    /**
     * Create an instance of {@link IdEntity.ClientIdList }
     * 
     */
    public IdEntity.ClientIdList createIdEntityClientIdList() {
        return new IdEntity.ClientIdList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTaskId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerTaskId")
    public JAXBElement<ProviderTaskId> createProviderTaskId(ProviderTaskId value) {
        return new JAXBElement<ProviderTaskId>(_ProviderTaskId_QNAME, ProviderTaskId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomProviderTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createCustomProviderTask")
    public JAXBElement<CreateCustomProviderTask> createCreateCustomProviderTask(CreateCustomProviderTask value) {
        return new JAXBElement<CreateCustomProviderTask>(_CreateCustomProviderTask_QNAME, CreateCustomProviderTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClientListAsId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchClientListAsId")
    public JAXBElement<SearchClientListAsId> createSearchClientListAsId(SearchClientListAsId value) {
        return new JAXBElement<SearchClientListAsId>(_SearchClientListAsId_QNAME, SearchClientListAsId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClientWithOptions")
    public JAXBElement<UpdateClientWithOptions> createUpdateClientWithOptions(UpdateClientWithOptions value) {
        return new JAXBElement<UpdateClientWithOptions>(_UpdateClientWithOptions_QNAME, UpdateClientWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProviderResponse")
    public JAXBElement<UpdateProviderResponse> createUpdateProviderResponse(UpdateProviderResponse value) {
        return new JAXBElement<UpdateProviderResponse>(_UpdateProviderResponse_QNAME, UpdateProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoProviderRecordOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undoProviderRecordOperation")
    public JAXBElement<UndoProviderRecordOperation> createUndoProviderRecordOperation(UndoProviderRecordOperation value) {
        return new JAXBElement<UndoProviderRecordOperation>(_UndoProviderRecordOperation_QNAME, UndoProviderRecordOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "credentialId")
    public JAXBElement<CredentialId> createCredentialId(CredentialId value) {
        return new JAXBElement<CredentialId>(_CredentialId_QNAME, CredentialId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoClientRecordOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undoClientRecordOperation")
    public JAXBElement<UndoClientRecordOperation> createUndoClientRecordOperation(UndoClientRecordOperation value) {
        return new JAXBElement<UndoClientRecordOperation>(_UndoClientRecordOperation_QNAME, UndoClientRecordOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForIdListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForIdListResponse")
    public JAXBElement<SearchForIdListResponse> createSearchForIdListResponse(SearchForIdListResponse value) {
        return new JAXBElement<SearchForIdListResponse>(_SearchForIdListResponse_QNAME, SearchForIdListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientTextSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientTextSearchResult")
    public JAXBElement<ClientTextSearchResult> createClientTextSearchResult(ClientTextSearchResult value) {
        return new JAXBElement<ClientTextSearchResult>(_ClientTextSearchResult_QNAME, ClientTextSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProviderWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProviderWithOptions")
    public JAXBElement<UpdateProviderWithOptions> createUpdateProviderWithOptions(UpdateProviderWithOptions value) {
        return new JAXBElement<UpdateProviderWithOptions>(_UpdateProviderWithOptions_QNAME, UpdateProviderWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createProvider")
    public JAXBElement<CreateProvider> createCreateProvider(CreateProvider value) {
        return new JAXBElement<CreateProvider>(_CreateProvider_QNAME, CreateProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedProvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedProvResponse")
    public JAXBElement<UpdateQualifiedProvResponse> createUpdateQualifiedProvResponse(UpdateQualifiedProvResponse value) {
        return new JAXBElement<UpdateQualifiedProvResponse>(_UpdateQualifiedProvResponse_QNAME, UpdateQualifiedProvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undeleteProvider")
    public JAXBElement<UndeleteProvider> createUndeleteProvider(UndeleteProvider value) {
        return new JAXBElement<UndeleteProvider>(_UndeleteProvider_QNAME, UndeleteProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedProvWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedProvWithOptions")
    public JAXBElement<UpdateQualifiedProvWithOptions> createUpdateQualifiedProvWithOptions(UpdateQualifiedProvWithOptions value) {
        return new JAXBElement<UpdateQualifiedProvWithOptions>(_UpdateQualifiedProvWithOptions_QNAME, UpdateQualifiedProvWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProvListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProvListResponse")
    public JAXBElement<SearchForProvListResponse> createSearchForProvListResponse(SearchForProvListResponse value) {
        return new JAXBElement<SearchForProvListResponse>(_SearchForProvListResponse_QNAME, SearchForProvListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvEntitySearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "provEntitySearchResult")
    public JAXBElement<ProvEntitySearchResult> createProvEntitySearchResult(ProvEntitySearchResult value) {
        return new JAXBElement<ProvEntitySearchResult>(_ProvEntitySearchResult_QNAME, ProvEntitySearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForTermList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForTermList")
    public JAXBElement<TextSearchForTermList> createTextSearchForTermList(TextSearchForTermList value) {
        return new JAXBElement<TextSearchForTermList>(_TextSearchForTermList_QNAME, TextSearchForTermList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createClient")
    public JAXBElement<CreateClient> createCreateClient(CreateClient value) {
        return new JAXBElement<CreateClient>(_CreateClient_QNAME, CreateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderCustomTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerCustomTask")
    public JAXBElement<ProviderCustomTask> createProviderCustomTask(ProviderCustomTask value) {
        return new JAXBElement<ProviderCustomTask>(_ProviderCustomTask_QNAME, ProviderCustomTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdEntityTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "idEntityTask")
    public JAXBElement<IdEntityTask> createIdEntityTask(IdEntityTask value) {
        return new JAXBElement<IdEntityTask>(_IdEntityTask_QNAME, IdEntityTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmergeClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unmergeClient")
    public JAXBElement<UnmergeClient> createUnmergeClient(UnmergeClient value) {
        return new JAXBElement<UnmergeClient>(_UnmergeClient_QNAME, UnmergeClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareProviderAsProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "compareProviderAsProv")
    public JAXBElement<CompareProviderAsProv> createCompareProviderAsProv(CompareProviderAsProv value) {
        return new JAXBElement<CompareProviderAsProv>(_CompareProviderAsProv_QNAME, CompareProviderAsProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createClientWithOptions")
    public JAXBElement<CreateClientWithOptions> createCreateClientWithOptions(CreateClientWithOptions value) {
        return new JAXBElement<CreateClientWithOptions>(_CreateClientWithOptions_QNAME, CreateClientWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClientListAsIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchClientListAsIdResponse")
    public JAXBElement<SearchClientListAsIdResponse> createSearchClientListAsIdResponse(SearchClientListAsIdResponse value) {
        return new JAXBElement<SearchClientListAsIdResponse>(_SearchClientListAsIdResponse_QNAME, SearchClientListAsIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getClientTask")
    public JAXBElement<GetClientTask> createGetClientTask(GetClientTask value) {
        return new JAXBElement<GetClientTask>(_GetClientTask_QNAME, GetClientTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getClientList")
    public JAXBElement<GetClientList> createGetClientList(GetClientList value) {
        return new JAXBElement<GetClientList>(_GetClientList_QNAME, GetClientList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "mergeProvider")
    public JAXBElement<MergeProvider> createMergeProvider(MergeProvider value) {
        return new JAXBElement<MergeProvider>(_MergeProvider_QNAME, MergeProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "mergeProviderResponse")
    public JAXBElement<MergeProviderResponse> createMergeProviderResponse(MergeProviderResponse value) {
        return new JAXBElement<MergeProviderResponse>(_MergeProviderResponse_QNAME, MergeProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "mergeClientResponse")
    public JAXBElement<MergeClientResponse> createMergeClientResponse(MergeClientResponse value) {
        return new JAXBElement<MergeClientResponse>(_MergeClientResponse_QNAME, MergeClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProviderListAsProvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchProviderListAsProvResponse")
    public JAXBElement<SearchProviderListAsProvResponse> createSearchProviderListAsProvResponse(SearchProviderListAsProvResponse value) {
        return new JAXBElement<SearchProviderListAsProvResponse>(_SearchProviderListAsProvResponse_QNAME, SearchProviderListAsProvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createProviderResponse")
    public JAXBElement<CreateProviderResponse> createCreateProviderResponse(CreateProviderResponse value) {
        return new JAXBElement<CreateProviderResponse>(_CreateProviderResponse_QNAME, CreateProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "dropProvider")
    public JAXBElement<DropProvider> createDropProvider(DropProvider value) {
        return new JAXBElement<DropProvider>(_DropProvider_QNAME, DropProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoClientRecordOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undoClientRecordOperationResponse")
    public JAXBElement<UndoClientRecordOperationResponse> createUndoClientRecordOperationResponse(UndoClientRecordOperationResponse value) {
        return new JAXBElement<UndoClientRecordOperationResponse>(_UndoClientRecordOperationResponse_QNAME, UndoClientRecordOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdEntityWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateIdEntityWithOptions")
    public JAXBElement<UpdateIdEntityWithOptions> createUpdateIdEntityWithOptions(UpdateIdEntityWithOptions value) {
        return new JAXBElement<UpdateIdEntityWithOptions>(_UpdateIdEntityWithOptions_QNAME, UpdateIdEntityWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "deleteProvider")
    public JAXBElement<DeleteProvider> createDeleteProvider(DeleteProvider value) {
        return new JAXBElement<DeleteProvider>(_DeleteProvider_QNAME, DeleteProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProviderTask")
    public JAXBElement<GetProviderTask> createGetProviderTask(GetProviderTask value) {
        return new JAXBElement<GetProviderTask>(_GetProviderTask_QNAME, GetProviderTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkIdEntityLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "markIdEntityLinkResponse")
    public JAXBElement<MarkIdEntityLinkResponse> createMarkIdEntityLinkResponse(MarkIdEntityLinkResponse value) {
        return new JAXBElement<MarkIdEntityLinkResponse>(_MarkIdEntityLinkResponse_QNAME, MarkIdEntityLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerSearchResult")
    public JAXBElement<ProviderSearchResult> createProviderSearchResult(ProviderSearchResult value) {
        return new JAXBElement<ProviderSearchResult>(_ProviderSearchResult_QNAME, ProviderSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createClientWithOptionsResponse")
    public JAXBElement<CreateClientWithOptionsResponse> createCreateClientWithOptionsResponse(CreateClientWithOptionsResponse value) {
        return new JAXBElement<CreateClientWithOptionsResponse>(_CreateClientWithOptionsResponse_QNAME, CreateClientWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityListByProvEntityIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityListByProvEntityIdsResponse")
    public JAXBElement<GetProvEntityListByProvEntityIdsResponse> createGetProvEntityListByProvEntityIdsResponse(GetProvEntityListByProvEntityIdsResponse value) {
        return new JAXBElement<GetProvEntityListByProvEntityIdsResponse>(_GetProvEntityListByProvEntityIdsResponse_QNAME, GetProvEntityListByProvEntityIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreClientAsIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "scoreClientAsIdResponse")
    public JAXBElement<ScoreClientAsIdResponse> createScoreClientAsIdResponse(ScoreClientAsIdResponse value) {
        return new JAXBElement<ScoreClientAsIdResponse>(_ScoreClientAsIdResponse_QNAME, ScoreClientAsIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmergeProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unmergeProviderResponse")
    public JAXBElement<UnmergeProviderResponse> createUnmergeProviderResponse(UnmergeProviderResponse value) {
        return new JAXBElement<UnmergeProviderResponse>(_UnmergeProviderResponse_QNAME, UnmergeProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreClientAsId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "scoreClientAsId")
    public JAXBElement<ScoreClientAsId> createScoreClientAsId(ScoreClientAsId value) {
        return new JAXBElement<ScoreClientAsId>(_ScoreClientAsId_QNAME, ScoreClientAsId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProvEntityWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProvEntityWithOptions")
    public JAXBElement<UpdateProvEntityWithOptions> createUpdateProvEntityWithOptions(UpdateProvEntityWithOptions value) {
        return new JAXBElement<UpdateProvEntityWithOptions>(_UpdateProvEntityWithOptions_QNAME, UpdateProvEntityWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientTaskId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientTaskId")
    public JAXBElement<ClientTaskId> createClientTaskId(ClientTaskId value) {
        return new JAXBElement<ClientTaskId>(_ClientTaskId_QNAME, ClientTaskId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvEntityTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "provEntityTask")
    public JAXBElement<ProvEntityTask> createProvEntityTask(ProvEntityTask value) {
        return new JAXBElement<ProvEntityTask>(_ProvEntityTask_QNAME, ProvEntityTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityTask")
    public JAXBElement<GetIdEntityTask> createGetIdEntityTask(GetIdEntityTask value) {
        return new JAXBElement<GetIdEntityTask>(_GetIdEntityTask_QNAME, GetIdEntityTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProviderTaskResponse")
    public JAXBElement<GetProviderTaskResponse> createGetProviderTaskResponse(GetProviderTaskResponse value) {
        return new JAXBElement<GetProviderTaskResponse>(_GetProviderTaskResponse_QNAME, GetProviderTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProviderWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProviderWithOptionsResponse")
    public JAXBElement<UpdateProviderWithOptionsResponse> createUpdateProviderWithOptionsResponse(UpdateProviderWithOptionsResponse value) {
        return new JAXBElement<UpdateProviderWithOptionsResponse>(_UpdateProviderWithOptionsResponse_QNAME, UpdateProviderWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "dropClient")
    public JAXBElement<DropClient> createDropClient(DropClient value) {
        return new JAXBElement<DropClient>(_DropClient_QNAME, DropClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProviderTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProviderTask")
    public JAXBElement<UpdateProviderTask> createUpdateProviderTask(UpdateProviderTask value) {
        return new JAXBElement<UpdateProviderTask>(_UpdateProviderTask_QNAME, UpdateProviderTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedProv")
    public JAXBElement<UpdateQualifiedProv> createUpdateQualifiedProv(UpdateQualifiedProv value) {
        return new JAXBElement<UpdateQualifiedProv>(_UpdateQualifiedProv_QNAME, UpdateQualifiedProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForProvListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForProvListResponse")
    public JAXBElement<TextSearchForProvListResponse> createTextSearchForProvListResponse(TextSearchForProvListResponse value) {
        return new JAXBElement<TextSearchForProvListResponse>(_TextSearchForProvListResponse_QNAME, TextSearchForProvListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkProviderToProvEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "linkProviderToProvEntity")
    public JAXBElement<LinkProviderToProvEntity> createLinkProviderToProvEntity(LinkProviderToProvEntity value) {
        return new JAXBElement<LinkProviderToProvEntity>(_LinkProviderToProvEntity_QNAME, LinkProviderToProvEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlinkProviderFromProvEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unlinkProviderFromProvEntityResponse")
    public JAXBElement<UnlinkProviderFromProvEntityResponse> createUnlinkProviderFromProvEntityResponse(UnlinkProviderFromProvEntityResponse value) {
        return new JAXBElement<UnlinkProviderFromProvEntityResponse>(_UnlinkProviderFromProvEntityResponse_QNAME, UnlinkProviderFromProvEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "deleteProviderResponse")
    public JAXBElement<DeleteProviderResponse> createDeleteProviderResponse(DeleteProviderResponse value) {
        return new JAXBElement<DeleteProviderResponse>(_DeleteProviderResponse_QNAME, DeleteProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityListByIdEntityIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityListByIdEntityIdsResponse")
    public JAXBElement<GetIdEntityListByIdEntityIdsResponse> createGetIdEntityListByIdEntityIdsResponse(GetIdEntityListByIdEntityIdsResponse value) {
        return new JAXBElement<GetIdEntityListByIdEntityIdsResponse>(_GetIdEntityListByIdEntityIdsResponse_QNAME, GetIdEntityListByIdEntityIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndoProviderRecordOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undoProviderRecordOperationResponse")
    public JAXBElement<UndoProviderRecordOperationResponse> createUndoProviderRecordOperationResponse(UndoProviderRecordOperationResponse value) {
        return new JAXBElement<UndoProviderRecordOperationResponse>(_UndoProviderRecordOperationResponse_QNAME, UndoProviderRecordOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkProvEntityLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "markProvEntityLink")
    public JAXBElement<MarkProvEntityLink> createMarkProvEntityLink(MarkProvEntityLink value) {
        return new JAXBElement<MarkProvEntityLink>(_MarkProvEntityLink_QNAME, MarkProvEntityLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTextSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerTextSearchResult")
    public JAXBElement<ProviderTextSearchResult> createProviderTextSearchResult(ProviderTextSearchResult value) {
        return new JAXBElement<ProviderTextSearchResult>(_ProviderTextSearchResult_QNAME, ProviderTextSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "auditData")
    public JAXBElement<AuditData> createAuditData(AuditData value) {
        return new JAXBElement<AuditData>(_AuditData_QNAME, AuditData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateProviderWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateProviderWithOptions")
    public JAXBElement<CreateOrUpdateProviderWithOptions> createCreateOrUpdateProviderWithOptions(CreateOrUpdateProviderWithOptions value) {
        return new JAXBElement<CreateOrUpdateProviderWithOptions>(_CreateOrUpdateProviderWithOptions_QNAME, CreateOrUpdateProviderWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProviderList")
    public JAXBElement<GetProviderList> createGetProviderList(GetProviderList value) {
        return new JAXBElement<GetProviderList>(_GetProviderList_QNAME, GetProviderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForProvList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForProvList")
    public JAXBElement<TextSearchForProvList> createTextSearchForProvList(TextSearchForProvList value) {
        return new JAXBElement<TextSearchForProvList>(_TextSearchForProvList_QNAME, TextSearchForProvList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchProviderListAsProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchProviderListAsProv")
    public JAXBElement<TextSearchProviderListAsProv> createTextSearchProviderListAsProv(TextSearchProviderListAsProv value) {
        return new JAXBElement<TextSearchProviderListAsProv>(_TextSearchProviderListAsProv_QNAME, TextSearchProviderListAsProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterDataServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "MasterDataServiceException")
    public JAXBElement<MasterDataServiceException> createMasterDataServiceException(MasterDataServiceException value) {
        return new JAXBElement<MasterDataServiceException>(_MasterDataServiceException_QNAME, MasterDataServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTextSearchHitResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerTextSearchHitResult")
    public JAXBElement<ProviderTextSearchHitResult> createProviderTextSearchHitResult(ProviderTextSearchHitResult value) {
        return new JAXBElement<ProviderTextSearchHitResult>(_ProviderTextSearchHitResult_QNAME, ProviderTextSearchHitResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkIdEntityLink }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "markIdEntityLink")
    public JAXBElement<MarkIdEntityLink> createMarkIdEntityLink(MarkIdEntityLink value) {
        return new JAXBElement<MarkIdEntityLink>(_MarkIdEntityLink_QNAME, MarkIdEntityLink.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareClientAsIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "compareClientAsIdResponse")
    public JAXBElement<CompareClientAsIdResponse> createCompareClientAsIdResponse(CompareClientAsIdResponse value) {
        return new JAXBElement<CompareClientAsIdResponse>(_CompareClientAsIdResponse_QNAME, CompareClientAsIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchClientListAsId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchClientListAsId")
    public JAXBElement<TextSearchClientListAsId> createTextSearchClientListAsId(TextSearchClientListAsId value) {
        return new JAXBElement<TextSearchClientListAsId>(_TextSearchClientListAsId_QNAME, TextSearchClientListAsId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClientResponse")
    public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
        return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateClient")
    public JAXBElement<CreateOrUpdateClient> createCreateOrUpdateClient(CreateOrUpdateClient value) {
        return new JAXBElement<CreateOrUpdateClient>(_CreateOrUpdateClient_QNAME, CreateOrUpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undeleteProviderResponse")
    public JAXBElement<UndeleteProviderResponse> createUndeleteProviderResponse(UndeleteProviderResponse value) {
        return new JAXBElement<UndeleteProviderResponse>(_UndeleteProviderResponse_QNAME, UndeleteProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityTaskResponse")
    public JAXBElement<GetProvEntityTaskResponse> createGetProvEntityTaskResponse(GetProvEntityTaskResponse value) {
        return new JAXBElement<GetProvEntityTaskResponse>(_GetProvEntityTaskResponse_QNAME, GetProvEntityTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedId")
    public JAXBElement<UpdateQualifiedId> createUpdateQualifiedId(UpdateQualifiedId value) {
        return new JAXBElement<UpdateQualifiedId>(_UpdateQualifiedId_QNAME, UpdateQualifiedId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForClientTaskByCredentialIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForClientTaskByCredentialIds")
    public JAXBElement<SearchForClientTaskByCredentialIds> createSearchForClientTaskByCredentialIds(SearchForClientTaskByCredentialIds value) {
        return new JAXBElement<SearchForClientTaskByCredentialIds>(_SearchForClientTaskByCredentialIds_QNAME, SearchForClientTaskByCredentialIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkClientToIdEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "linkClientToIdEntityResponse")
    public JAXBElement<LinkClientToIdEntityResponse> createLinkClientToIdEntityResponse(LinkClientToIdEntityResponse value) {
        return new JAXBElement<LinkClientToIdEntityResponse>(_LinkClientToIdEntityResponse_QNAME, LinkClientToIdEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmergeClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unmergeClientResponse")
    public JAXBElement<UnmergeClientResponse> createUnmergeClientResponse(UnmergeClientResponse value) {
        return new JAXBElement<UnmergeClientResponse>(_UnmergeClientResponse_QNAME, UnmergeClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityList")
    public JAXBElement<GetProvEntityList> createGetProvEntityList(GetProvEntityList value) {
        return new JAXBElement<GetProvEntityList>(_GetProvEntityList_QNAME, GetProvEntityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProvList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProvList")
    public JAXBElement<SearchForProvList> createSearchForProvList(SearchForProvList value) {
        return new JAXBElement<SearchForProvList>(_SearchForProvList_QNAME, SearchForProvList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProviderTaskByCredentialIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProviderTaskByCredentialIdsResponse")
    public JAXBElement<SearchForProviderTaskByCredentialIdsResponse> createSearchForProviderTaskByCredentialIdsResponse(SearchForProviderTaskByCredentialIdsResponse value) {
        return new JAXBElement<SearchForProviderTaskByCredentialIdsResponse>(_SearchForProviderTaskByCredentialIdsResponse_QNAME, SearchForProviderTaskByCredentialIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreProviderAsProvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "scoreProviderAsProvResponse")
    public JAXBElement<ScoreProviderAsProvResponse> createScoreProviderAsProvResponse(ScoreProviderAsProvResponse value) {
        return new JAXBElement<ScoreProviderAsProvResponse>(_ScoreProviderAsProvResponse_QNAME, ScoreProviderAsProvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClientTask")
    public JAXBElement<UpdateClientTask> createUpdateClientTask(UpdateClientTask value) {
        return new JAXBElement<UpdateClientTask>(_UpdateClientTask_QNAME, UpdateClientTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProviderTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProviderTaskResponse")
    public JAXBElement<UpdateProviderTaskResponse> createUpdateProviderTaskResponse(UpdateProviderTaskResponse value) {
        return new JAXBElement<UpdateProviderTaskResponse>(_UpdateProviderTaskResponse_QNAME, UpdateProviderTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkProvEntityLinkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "markProvEntityLinkResponse")
    public JAXBElement<MarkProvEntityLinkResponse> createMarkProvEntityLinkResponse(MarkProvEntityLinkResponse value) {
        return new JAXBElement<MarkProvEntityLinkResponse>(_MarkProvEntityLinkResponse_QNAME, MarkProvEntityLinkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkClientToIdEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "linkClientToIdEntity")
    public JAXBElement<LinkClientToIdEntity> createLinkClientToIdEntity(LinkClientToIdEntity value) {
        return new JAXBElement<LinkClientToIdEntity>(_LinkClientToIdEntity_QNAME, LinkClientToIdEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityList")
    public JAXBElement<GetIdEntityList> createGetIdEntityList(GetIdEntityList value) {
        return new JAXBElement<GetIdEntityList>(_GetIdEntityList_QNAME, GetIdEntityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MergeClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "mergeClient")
    public JAXBElement<MergeClient> createMergeClient(MergeClient value) {
        return new JAXBElement<MergeClient>(_MergeClient_QNAME, MergeClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateProviderWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateProviderWithOptionsResponse")
    public JAXBElement<CreateOrUpdateProviderWithOptionsResponse> createCreateOrUpdateProviderWithOptionsResponse(CreateOrUpdateProviderWithOptionsResponse value) {
        return new JAXBElement<CreateOrUpdateProviderWithOptionsResponse>(_CreateOrUpdateProviderWithOptionsResponse_QNAME, CreateOrUpdateProviderWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProviderWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createProviderWithOptionsResponse")
    public JAXBElement<CreateProviderWithOptionsResponse> createCreateProviderWithOptionsResponse(CreateProviderWithOptionsResponse value) {
        return new JAXBElement<CreateProviderWithOptionsResponse>(_CreateProviderWithOptionsResponse_QNAME, CreateProviderWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientRecordTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientRecordTask")
    public JAXBElement<ClientRecordTask> createClientRecordTask(ClientRecordTask value) {
        return new JAXBElement<ClientRecordTask>(_ClientRecordTask_QNAME, ClientRecordTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedIdResponse")
    public JAXBElement<UpdateQualifiedIdResponse> createUpdateQualifiedIdResponse(UpdateQualifiedIdResponse value) {
        return new JAXBElement<UpdateQualifiedIdResponse>(_UpdateQualifiedIdResponse_QNAME, UpdateQualifiedIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForIdList")
    public JAXBElement<SearchForIdList> createSearchForIdList(SearchForIdList value) {
        return new JAXBElement<SearchForIdList>(_SearchForIdList_QNAME, SearchForIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdEntityWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateIdEntityWithOptionsResponse")
    public JAXBElement<UpdateIdEntityWithOptionsResponse> createUpdateIdEntityWithOptionsResponse(UpdateIdEntityWithOptionsResponse value) {
        return new JAXBElement<UpdateIdEntityWithOptionsResponse>(_UpdateIdEntityWithOptionsResponse_QNAME, UpdateIdEntityWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "idEntity")
    public JAXBElement<IdEntity> createIdEntity(IdEntity value) {
        return new JAXBElement<IdEntity>(_IdEntity_QNAME, IdEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "dropClientResponse")
    public JAXBElement<DropClientResponse> createDropClientResponse(DropClientResponse value) {
        return new JAXBElement<DropClientResponse>(_DropClientResponse_QNAME, DropClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityListByProvEntityIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityListByProvEntityIds")
    public JAXBElement<GetProvEntityListByProvEntityIds> createGetProvEntityListByProvEntityIds(GetProvEntityListByProvEntityIds value) {
        return new JAXBElement<GetProvEntityListByProvEntityIds>(_GetProvEntityListByProvEntityIds_QNAME, GetProvEntityListByProvEntityIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityTask")
    public JAXBElement<GetProvEntityTask> createGetProvEntityTask(GetProvEntityTask value) {
        return new JAXBElement<GetProvEntityTask>(_GetProvEntityTask_QNAME, GetProvEntityTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProvEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProvEntity")
    public JAXBElement<UpdateProvEntity> createUpdateProvEntity(UpdateProvEntity value) {
        return new JAXBElement<UpdateProvEntity>(_UpdateProvEntity_QNAME, UpdateProvEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedIdWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedIdWithOptions")
    public JAXBElement<UpdateQualifiedIdWithOptions> createUpdateQualifiedIdWithOptions(UpdateQualifiedIdWithOptions value) {
        return new JAXBElement<UpdateQualifiedIdWithOptions>(_UpdateQualifiedIdWithOptions_QNAME, UpdateQualifiedIdWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateClientWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateClientWithOptionsResponse")
    public JAXBElement<CreateOrUpdateClientWithOptionsResponse> createCreateOrUpdateClientWithOptionsResponse(CreateOrUpdateClientWithOptionsResponse value) {
        return new JAXBElement<CreateOrUpdateClientWithOptionsResponse>(_CreateOrUpdateClientWithOptionsResponse_QNAME, CreateOrUpdateClientWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateClientResponse")
    public JAXBElement<CreateOrUpdateClientResponse> createCreateOrUpdateClientResponse(CreateOrUpdateClientResponse value) {
        return new JAXBElement<CreateOrUpdateClientResponse>(_CreateOrUpdateClientResponse_QNAME, CreateOrUpdateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProviderTaskByProviderIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProviderTaskByProviderIds")
    public JAXBElement<SearchForProviderTaskByProviderIds> createSearchForProviderTaskByProviderIds(SearchForProviderTaskByProviderIds value) {
        return new JAXBElement<SearchForProviderTaskByProviderIds>(_SearchForProviderTaskByProviderIds_QNAME, SearchForProviderTaskByProviderIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareProviderAsProvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "compareProviderAsProvResponse")
    public JAXBElement<CompareProviderAsProvResponse> createCompareProviderAsProvResponse(CompareProviderAsProvResponse value) {
        return new JAXBElement<CompareProviderAsProvResponse>(_CompareProviderAsProvResponse_QNAME, CompareProviderAsProvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmergeProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unmergeProvider")
    public JAXBElement<UnmergeProvider> createUnmergeProvider(UnmergeProvider value) {
        return new JAXBElement<UnmergeProvider>(_UnmergeProvider_QNAME, UnmergeProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateClientWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateClientWithOptions")
    public JAXBElement<CreateOrUpdateClientWithOptions> createCreateOrUpdateClientWithOptions(CreateOrUpdateClientWithOptions value) {
        return new JAXBElement<CreateOrUpdateClientWithOptions>(_CreateOrUpdateClientWithOptions_QNAME, CreateOrUpdateClientWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProvEntityWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProvEntityWithOptionsResponse")
    public JAXBElement<UpdateProvEntityWithOptionsResponse> createUpdateProvEntityWithOptionsResponse(UpdateProvEntityWithOptionsResponse value) {
        return new JAXBElement<UpdateProvEntityWithOptionsResponse>(_UpdateProvEntityWithOptionsResponse_QNAME, UpdateProvEntityWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProviderListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProviderListResponse")
    public JAXBElement<GetProviderListResponse> createGetProviderListResponse(GetProviderListResponse value) {
        return new JAXBElement<GetProviderListResponse>(_GetProviderListResponse_QNAME, GetProviderListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomProviderTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createCustomProviderTaskResponse")
    public JAXBElement<CreateCustomProviderTaskResponse> createCreateCustomProviderTaskResponse(CreateCustomProviderTaskResponse value) {
        return new JAXBElement<CreateCustomProviderTaskResponse>(_CreateCustomProviderTaskResponse_QNAME, CreateCustomProviderTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchProviderListAsProvResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchProviderListAsProvResponse")
    public JAXBElement<TextSearchProviderListAsProvResponse> createTextSearchProviderListAsProvResponse(TextSearchProviderListAsProvResponse value) {
        return new JAXBElement<TextSearchProviderListAsProvResponse>(_TextSearchProviderListAsProvResponse_QNAME, TextSearchProviderListAsProvResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomClientTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createCustomClientTaskResponse")
    public JAXBElement<CreateCustomClientTaskResponse> createCreateCustomClientTaskResponse(CreateCustomClientTaskResponse value) {
        return new JAXBElement<CreateCustomClientTaskResponse>(_CreateCustomClientTaskResponse_QNAME, CreateCustomClientTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getClientListResponse")
    public JAXBElement<GetClientListResponse> createGetClientListResponse(GetClientListResponse value) {
        return new JAXBElement<GetClientListResponse>(_GetClientListResponse_QNAME, GetClientListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProviderTaskByCredentialIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProviderTaskByCredentialIds")
    public JAXBElement<SearchForProviderTaskByCredentialIds> createSearchForProviderTaskByCredentialIds(SearchForProviderTaskByCredentialIds value) {
        return new JAXBElement<SearchForProviderTaskByCredentialIds>(_SearchForProviderTaskByCredentialIds_QNAME, SearchForProviderTaskByCredentialIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClientWithOptionsResponse")
    public JAXBElement<UpdateClientWithOptionsResponse> createUpdateClientWithOptionsResponse(UpdateClientWithOptionsResponse value) {
        return new JAXBElement<UpdateClientWithOptionsResponse>(_UpdateClientWithOptionsResponse_QNAME, UpdateClientWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateProviderResponse")
    public JAXBElement<CreateOrUpdateProviderResponse> createCreateOrUpdateProviderResponse(CreateOrUpdateProviderResponse value) {
        return new JAXBElement<CreateOrUpdateProviderResponse>(_CreateOrUpdateProviderResponse_QNAME, CreateOrUpdateProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undeleteClient")
    public JAXBElement<UndeleteClient> createUndeleteClient(UndeleteClient value) {
        return new JAXBElement<UndeleteClient>(_UndeleteClient_QNAME, UndeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "provEntity")
    public JAXBElement<ProvEntity> createProvEntity(ProvEntity value) {
        return new JAXBElement<ProvEntity>(_ProvEntity_QNAME, ProvEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityTaskResponse")
    public JAXBElement<GetIdEntityTaskResponse> createGetIdEntityTaskResponse(GetIdEntityTaskResponse value) {
        return new JAXBElement<GetIdEntityTaskResponse>(_GetIdEntityTaskResponse_QNAME, GetIdEntityTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkProviderToProvEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "linkProviderToProvEntityResponse")
    public JAXBElement<LinkProviderToProvEntityResponse> createLinkProviderToProvEntityResponse(LinkProviderToProvEntityResponse value) {
        return new JAXBElement<LinkProviderToProvEntityResponse>(_LinkProviderToProvEntityResponse_QNAME, LinkProviderToProvEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForIdList")
    public JAXBElement<TextSearchForIdList> createTextSearchForIdList(TextSearchForIdList value) {
        return new JAXBElement<TextSearchForIdList>(_TextSearchForIdList_QNAME, TextSearchForIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForClientTaskByCredentialIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForClientTaskByCredentialIdsResponse")
    public JAXBElement<SearchForClientTaskByCredentialIdsResponse> createSearchForClientTaskByCredentialIdsResponse(SearchForClientTaskByCredentialIdsResponse value) {
        return new JAXBElement<SearchForClientTaskByCredentialIdsResponse>(_SearchForClientTaskByCredentialIdsResponse_QNAME, SearchForClientTaskByCredentialIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProvEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProvEntityResponse")
    public JAXBElement<UpdateProvEntityResponse> createUpdateProvEntityResponse(UpdateProvEntityResponse value) {
        return new JAXBElement<UpdateProvEntityResponse>(_UpdateProvEntityResponse_QNAME, UpdateProvEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateIdEntity")
    public JAXBElement<UpdateIdEntity> createUpdateIdEntity(UpdateIdEntity value) {
        return new JAXBElement<UpdateIdEntity>(_UpdateIdEntity_QNAME, UpdateIdEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientTextSearchHitResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientTextSearchHitResult")
    public JAXBElement<ClientTextSearchHitResult> createClientTextSearchHitResult(ClientTextSearchHitResult value) {
        return new JAXBElement<ClientTextSearchHitResult>(_ClientTextSearchHitResult_QNAME, ClientTextSearchHitResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScoreProviderAsProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "scoreProviderAsProv")
    public JAXBElement<ScoreProviderAsProv> createScoreProviderAsProv(ScoreProviderAsProv value) {
        return new JAXBElement<ScoreProviderAsProv>(_ScoreProviderAsProv_QNAME, ScoreProviderAsProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForIdListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForIdListResponse")
    public JAXBElement<TextSearchForIdListResponse> createTextSearchForIdListResponse(TextSearchForIdListResponse value) {
        return new JAXBElement<TextSearchForIdListResponse>(_TextSearchForIdListResponse_QNAME, TextSearchForIdListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedIdWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedIdWithOptionsResponse")
    public JAXBElement<UpdateQualifiedIdWithOptionsResponse> createUpdateQualifiedIdWithOptionsResponse(UpdateQualifiedIdWithOptionsResponse value) {
        return new JAXBElement<UpdateQualifiedIdWithOptionsResponse>(_UpdateQualifiedIdWithOptionsResponse_QNAME, UpdateQualifiedIdWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForClientTaskByClientIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForClientTaskByClientIds")
    public JAXBElement<SearchForClientTaskByClientIds> createSearchForClientTaskByClientIds(SearchForClientTaskByClientIds value) {
        return new JAXBElement<SearchForClientTaskByClientIds>(_SearchForClientTaskByClientIds_QNAME, SearchForClientTaskByClientIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIdEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateIdEntityResponse")
    public JAXBElement<UpdateIdEntityResponse> createUpdateIdEntityResponse(UpdateIdEntityResponse value) {
        return new JAXBElement<UpdateIdEntityResponse>(_UpdateIdEntityResponse_QNAME, UpdateIdEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createOrUpdateProvider")
    public JAXBElement<CreateOrUpdateProvider> createCreateOrUpdateProvider(CreateOrUpdateProvider value) {
        return new JAXBElement<CreateOrUpdateProvider>(_CreateOrUpdateProvider_QNAME, CreateOrUpdateProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientCustomTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientCustomTask")
    public JAXBElement<ClientCustomTask> createClientCustomTask(ClientCustomTask value) {
        return new JAXBElement<ClientCustomTask>(_ClientCustomTask_QNAME, ClientCustomTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomClientTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createCustomClientTask")
    public JAXBElement<CreateCustomClientTask> createCreateCustomClientTask(CreateCustomClientTask value) {
        return new JAXBElement<CreateCustomClientTask>(_CreateCustomClientTask_QNAME, CreateCustomClientTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlinkClientFromIdEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unlinkClientFromIdEntity")
    public JAXBElement<UnlinkClientFromIdEntity> createUnlinkClientFromIdEntity(UnlinkClientFromIdEntity value) {
        return new JAXBElement<UnlinkClientFromIdEntity>(_UnlinkClientFromIdEntity_QNAME, UnlinkClientFromIdEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createClientResponse")
    public JAXBElement<CreateClientResponse> createCreateClientResponse(CreateClientResponse value) {
        return new JAXBElement<CreateClientResponse>(_CreateClientResponse_QNAME, CreateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UndeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "undeleteClientResponse")
    public JAXBElement<UndeleteClientResponse> createUndeleteClientResponse(UndeleteClientResponse value) {
        return new JAXBElement<UndeleteClientResponse>(_UndeleteClientResponse_QNAME, UndeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlinkProviderFromProvEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unlinkProviderFromProvEntity")
    public JAXBElement<UnlinkProviderFromProvEntity> createUnlinkProviderFromProvEntity(UnlinkProviderFromProvEntity value) {
        return new JAXBElement<UnlinkProviderFromProvEntity>(_UnlinkProviderFromProvEntity_QNAME, UnlinkProviderFromProvEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "dropProviderResponse")
    public JAXBElement<DropProviderResponse> createDropProviderResponse(DropProviderResponse value) {
        return new JAXBElement<DropProviderResponse>(_DropProviderResponse_QNAME, DropProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getClientTaskResponse")
    public JAXBElement<GetClientTaskResponse> createGetClientTaskResponse(GetClientTaskResponse value) {
        return new JAXBElement<GetClientTaskResponse>(_GetClientTaskResponse_QNAME, GetClientTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateProvider")
    public JAXBElement<UpdateProvider> createUpdateProvider(UpdateProvider value) {
        return new JAXBElement<UpdateProvider>(_UpdateProvider_QNAME, UpdateProvider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityListResponse")
    public JAXBElement<GetIdEntityListResponse> createGetIdEntityListResponse(GetIdEntityListResponse value) {
        return new JAXBElement<GetIdEntityListResponse>(_GetIdEntityListResponse_QNAME, GetIdEntityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProviderListAsProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchProviderListAsProv")
    public JAXBElement<SearchProviderListAsProv> createSearchProviderListAsProv(SearchProviderListAsProv value) {
        return new JAXBElement<SearchProviderListAsProv>(_SearchProviderListAsProv_QNAME, SearchProviderListAsProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClientTaskResponse")
    public JAXBElement<UpdateClientTaskResponse> createUpdateClientTaskResponse(UpdateClientTaskResponse value) {
        return new JAXBElement<UpdateClientTaskResponse>(_UpdateClientTaskResponse_QNAME, UpdateClientTaskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "termSearchResult")
    public JAXBElement<TermSearchResult> createTermSearchResult(TermSearchResult value) {
        return new JAXBElement<TermSearchResult>(_TermSearchResult_QNAME, TermSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlinkClientFromIdEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "unlinkClientFromIdEntityResponse")
    public JAXBElement<UnlinkClientFromIdEntityResponse> createUnlinkClientFromIdEntityResponse(UnlinkClientFromIdEntityResponse value) {
        return new JAXBElement<UnlinkClientFromIdEntityResponse>(_UnlinkClientFromIdEntityResponse_QNAME, UnlinkClientFromIdEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "provider")
    public JAXBElement<Provider> createProvider(Provider value) {
        return new JAXBElement<Provider>(_Provider_QNAME, Provider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdEntityListByIdEntityIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getIdEntityListByIdEntityIds")
    public JAXBElement<GetIdEntityListByIdEntityIds> createGetIdEntityListByIdEntityIds(GetIdEntityListByIdEntityIds value) {
        return new JAXBElement<GetIdEntityListByIdEntityIds>(_GetIdEntityListByIdEntityIds_QNAME, GetIdEntityListByIdEntityIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProvEntityListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "getProvEntityListResponse")
    public JAXBElement<GetProvEntityListResponse> createGetProvEntityListResponse(GetProvEntityListResponse value) {
        return new JAXBElement<GetProvEntityListResponse>(_GetProvEntityListResponse_QNAME, GetProvEntityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchClientListAsIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchClientListAsIdResponse")
    public JAXBElement<TextSearchClientListAsIdResponse> createTextSearchClientListAsIdResponse(TextSearchClientListAsIdResponse value) {
        return new JAXBElement<TextSearchClientListAsIdResponse>(_TextSearchClientListAsIdResponse_QNAME, TextSearchClientListAsIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdEntitySearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "idEntitySearchResult")
    public JAXBElement<IdEntitySearchResult> createIdEntitySearchResult(IdEntitySearchResult value) {
        return new JAXBElement<IdEntitySearchResult>(_IdEntitySearchResult_QNAME, IdEntitySearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForClientTaskByClientIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForClientTaskByClientIdsResponse")
    public JAXBElement<SearchForClientTaskByClientIdsResponse> createSearchForClientTaskByClientIdsResponse(SearchForClientTaskByClientIdsResponse value) {
        return new JAXBElement<SearchForClientTaskByClientIdsResponse>(_SearchForClientTaskByClientIdsResponse_QNAME, SearchForClientTaskByClientIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateQualifiedProvWithOptionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateQualifiedProvWithOptionsResponse")
    public JAXBElement<UpdateQualifiedProvWithOptionsResponse> createUpdateQualifiedProvWithOptionsResponse(UpdateQualifiedProvWithOptionsResponse value) {
        return new JAXBElement<UpdateQualifiedProvWithOptionsResponse>(_UpdateQualifiedProvWithOptionsResponse_QNAME, UpdateQualifiedProvWithOptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderRecordTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "providerRecordTask")
    public JAXBElement<ProviderRecordTask> createProviderRecordTask(ProviderRecordTask value) {
        return new JAXBElement<ProviderRecordTask>(_ProviderRecordTask_QNAME, ProviderRecordTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProviderWithOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "createProviderWithOptions")
    public JAXBElement<CreateProviderWithOptions> createCreateProviderWithOptions(CreateProviderWithOptions value) {
        return new JAXBElement<CreateProviderWithOptions>(_CreateProviderWithOptions_QNAME, CreateProviderWithOptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchForProviderTaskByProviderIdsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "searchForProviderTaskByProviderIdsResponse")
    public JAXBElement<SearchForProviderTaskByProviderIdsResponse> createSearchForProviderTaskByProviderIdsResponse(SearchForProviderTaskByProviderIdsResponse value) {
        return new JAXBElement<SearchForProviderTaskByProviderIdsResponse>(_SearchForProviderTaskByProviderIdsResponse_QNAME, SearchForProviderTaskByProviderIdsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "updateClient")
    public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
        return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "clientSearchResult")
    public JAXBElement<ClientSearchResult> createClientSearchResult(ClientSearchResult value) {
        return new JAXBElement<ClientSearchResult>(_ClientSearchResult_QNAME, ClientSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareClientAsId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "compareClientAsId")
    public JAXBElement<CompareClientAsId> createCompareClientAsId(CompareClientAsId value) {
        return new JAXBElement<CompareClientAsId>(_CompareClientAsId_QNAME, CompareClientAsId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextSearchForTermListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://client.initiate.com/", name = "textSearchForTermListResponse")
    public JAXBElement<TextSearchForTermListResponse> createTextSearchForTermListResponse(TextSearchForTermListResponse value) {
        return new JAXBElement<TextSearchForTermListResponse>(_TextSearchForTermListResponse_QNAME, TextSearchForTermListResponse.class, null, value);
    }

}
