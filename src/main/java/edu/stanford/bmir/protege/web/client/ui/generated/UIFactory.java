package edu.stanford.bmir.protege.web.client.ui.generated;

import com.google.common.collect.ImmutableMap;
import com.google.gwt.core.client.GWT;
import edu.stanford.bmir.protege.web.client.metrics.MetricsPortlet;
import edu.stanford.bmir.protege.web.client.portlet.PortletDescriptor;
import edu.stanford.bmir.protege.web.client.renderer.OWLEntityDescriptionBrowserPortlet;
import edu.stanford.bmir.protege.web.client.ui.editor.EditorPortlet;
import edu.stanford.bmir.protege.web.client.ui.frame.OWLEntityDescriptionEditorPortlet;
import edu.stanford.bmir.protege.web.client.ui.notes.DiscussionThreadPortlet;
import edu.stanford.bmir.protege.web.client.ui.obo.*;
import edu.stanford.bmir.protege.web.client.ui.ontology.annotations.OntologyAnnotationsPortlet;
import edu.stanford.bmir.protege.web.client.change.ProjectHistoryPortlet;
import edu.stanford.bmir.protege.web.client.change.EntityChangesPortlet;
import edu.stanford.bmir.protege.web.client.watches.WatchedEntitiesPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.classes.*;
import edu.stanford.bmir.protege.web.client.ui.ontology.id.OntologyIdPortlet;
import edu.stanford.bmir.protege.web.client.ui.individuals.IndividualsListPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.metadata.ImportsTreePortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.properties.PropertiesTreePortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.revisions.RevisionsPortlet;
import edu.stanford.bmir.protege.web.client.portlet.EntityPortlet;
import edu.stanford.bmir.protege.web.client.ui.projectfeed.ProjectFeedPortlet;
import edu.stanford.bmir.protege.web.client.usage.UsagePortlet;
import edu.stanford.bmir.protege.web.shared.PortletId;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.*;

/**
 * This class is supposed to be automatically generated by the GWT generator at
 * compile time. In the current version it is not.
 * <p/>
 * This is a factory class that will provide create methods for all tabs and
 * portlets. The UI configurator will use this class to layout the UI for a
 * particular project and user.
 * <p/>
 * This factory tries to compensate for the lack of reflection support in GWT
 * and JS.
 *
 * @author Tania Tudorache <tudorache@stanford.edu>
 */
public class UIFactory {

    public static final String PORTLET_SUFFIX = "Portlet";


    private static final ImmutableMap<String, String> backwardsCompatMap = ImmutableMap.<String, String>builder()
            .put("edu.stanford.bmir.protege.web.client.ui.ontology.changes.ChangesPortlet",
                    "edu.stanford.bmir.protege.web.client.change.ChangesPortlet")
            .put("edu.stanford.bmir.protege.web.client.ui.ontology.changes.WatchedEntitiesPortlet",
                    "edu.stanford.bmir.protege.web.client.watches.WatchedEntitiesPortlet")
            .build();

    private static List<PortletDescriptor> availablePortlets;


    @Inject
    public UIFactory(Provider<ClassTreePortlet> classTreePortletProvider, Provider<ImportsTreePortlet> importsTreePortletProvider, Provider<IndividualsListPortlet> individualsListPortletProvider, Provider<MetricsPortlet> metricsPortletProvider, Provider<PropertiesTreePortlet> propertiesTreePortletProvider, Provider<ProjectHistoryPortlet> changeSummaryPortletProvider, Provider<WatchedEntitiesPortlet> watchedEntitiesPortletProvider, Provider<EntityChangesPortlet> changesPortletProvider, Provider<OBOTermRelationshipPortlet> oboTermRelationshipPortletProvider, Provider<OBOTermDefinitionPortlet> oboTermDefinitionPortletProvider, Provider<OBOTermIdEditorPortlet> oboTermIdEditorPortletProvider, Provider<OBOTermSynonymsPortlet> oboTermSynonymsPortletProvider, Provider<OBOTermCrossProductPortlet> oboTermCrossProductPortletProvider, Provider<OBOTermXRefsEditorPortlet> oboTermXRefsEditorPortletProvider, Provider<RevisionsPortlet> revisionsPortletProvider, Provider<OntologyIdPortlet> ontologyIdPortletProvider, Provider<OntologyAnnotationsPortlet> ontologyAnnotationsPortletProvider, Provider<ProjectFeedPortlet> projectFeedPortletProvider, Provider<DiscussionThreadPortlet> discussionThreadPortletProvider, Provider<EditorPortlet> editorPortletProvider, Provider<UsagePortlet> usagePortletProvider, Provider<OWLEntityDescriptionBrowserPortlet> entityDescriptionBrowserPortletProvider, Provider<OWLEntityDescriptionEditorPortlet> entityDescriptionEditorPortletProvider) {
        this.classTreePortletProvider = classTreePortletProvider;
        this.importsTreePortletProvider = importsTreePortletProvider;
        this.individualsListPortletProvider = individualsListPortletProvider;
        this.metricsPortletProvider = metricsPortletProvider;
        this.propertiesTreePortletProvider = propertiesTreePortletProvider;
        this.changeSummaryPortletProvider = changeSummaryPortletProvider;
        this.watchedEntitiesPortletProvider = watchedEntitiesPortletProvider;
        this.changesPortletProvider = changesPortletProvider;
        this.oboTermRelationshipPortletProvider = oboTermRelationshipPortletProvider;
        this.oboTermDefinitionPortletProvider = oboTermDefinitionPortletProvider;
        this.oboTermIdEditorPortletProvider = oboTermIdEditorPortletProvider;
        this.oboTermSynonymsPortletProvider = oboTermSynonymsPortletProvider;
        this.oboTermCrossProductPortletProvider = oboTermCrossProductPortletProvider;
        this.oboTermXRefsEditorPortletProvider = oboTermXRefsEditorPortletProvider;
        this.revisionsPortletProvider = revisionsPortletProvider;
        this.ontologyIdPortletProvider = ontologyIdPortletProvider;
        this.ontologyAnnotationsPortletProvider = ontologyAnnotationsPortletProvider;
        this.projectFeedPortletProvider = projectFeedPortletProvider;
        this.discussionThreadPortletProvider = discussionThreadPortletProvider;
        this.editorPortletProvider = editorPortletProvider;
        this.usagePortletProvider = usagePortletProvider;
        this.entityDescriptionBrowserPortletProvider = entityDescriptionBrowserPortletProvider;
        this.entityDescriptionEditorPortletProvider = entityDescriptionEditorPortletProvider;
    }

//    private final PerspectiveFactory perspectiveFactory;
//
//    public Perspective createTab(TabId tabId) {
//        return perspectiveFactory.createUserDefinedTab(tabId);
//    }


    private final Provider<ClassTreePortlet> classTreePortletProvider;

    private final Provider<ImportsTreePortlet> importsTreePortletProvider;

    private final Provider<IndividualsListPortlet> individualsListPortletProvider;

    private final Provider<MetricsPortlet> metricsPortletProvider;

    private final Provider<PropertiesTreePortlet> propertiesTreePortletProvider;

    private final Provider<ProjectHistoryPortlet> changeSummaryPortletProvider;

    private final Provider<WatchedEntitiesPortlet> watchedEntitiesPortletProvider;

    private final Provider<EntityChangesPortlet> changesPortletProvider;

    private final Provider<OBOTermRelationshipPortlet> oboTermRelationshipPortletProvider;

    private final Provider<OBOTermDefinitionPortlet> oboTermDefinitionPortletProvider;

    private final Provider<OBOTermIdEditorPortlet> oboTermIdEditorPortletProvider;

    private final Provider<OBOTermSynonymsPortlet> oboTermSynonymsPortletProvider;

    private final Provider<OBOTermCrossProductPortlet> oboTermCrossProductPortletProvider;

    private final Provider<OBOTermXRefsEditorPortlet> oboTermXRefsEditorPortletProvider;

    private final Provider<RevisionsPortlet> revisionsPortletProvider;

    private final Provider<OntologyIdPortlet> ontologyIdPortletProvider;

    private final Provider<OntologyAnnotationsPortlet> ontologyAnnotationsPortletProvider;

    private final Provider<ProjectFeedPortlet> projectFeedPortletProvider;

    private final Provider<DiscussionThreadPortlet> discussionThreadPortletProvider;

    private final Provider<EditorPortlet> editorPortletProvider;

    private final Provider<UsagePortlet> usagePortletProvider;

    private final Provider<OWLEntityDescriptionBrowserPortlet> entityDescriptionBrowserPortletProvider;

    private final Provider<OWLEntityDescriptionEditorPortlet> entityDescriptionEditorPortletProvider;

    public static List<PortletDescriptor> getAvailablePortlets() {
        Map<String, String> map = UIFactory.getAvailablePortletNameMap();
        List<PortletDescriptor> portletDescriptorList = new ArrayList<>();
        for(String key : map.keySet()) {
            String value = map.get(key);
            portletDescriptorList.add(new PortletDescriptor(new PortletId(value), key));
        }
        return portletDescriptorList;
    }


    public EntityPortlet createPortlet(String portletJavaClassName) {
        EntityPortlet entityPortlet = null;
        try {
            String replacementName = backwardsCompatMap.get(portletJavaClassName);
            if(replacementName != null) {
                portletJavaClassName = replacementName;
            }
            
            if (portletJavaClassName.equals(ClassTreePortlet.class.getName())) {
                entityPortlet = classTreePortletProvider.get();
            }
            else if (portletJavaClassName.equals(ImportsTreePortlet.class.getName())) {
                entityPortlet = importsTreePortletProvider.get();
            }
            else if (portletJavaClassName.equals(IndividualsListPortlet.class.getName())) {
                entityPortlet = individualsListPortletProvider.get();
            }
            else if (portletJavaClassName.equals(MetricsPortlet.class.getName())) {
                entityPortlet = metricsPortletProvider.get();
            }
            else if (portletJavaClassName.equals(PropertiesTreePortlet.class.getName())) {
                entityPortlet = propertiesTreePortletProvider.get();
            }
            else if (portletJavaClassName.equals(ProjectHistoryPortlet.class.getName())) {
                entityPortlet = changeSummaryPortletProvider.get();
            }
            else if (portletJavaClassName.equals(WatchedEntitiesPortlet.class.getName())) {
                entityPortlet = watchedEntitiesPortletProvider.get();
            }
            else if (portletJavaClassName.equals(EntityChangesPortlet.class.getName())) {
                entityPortlet = changesPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermRelationshipPortlet.class.getName())) {
                entityPortlet = oboTermRelationshipPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermDefinitionPortlet.class.getName())) {
                entityPortlet = oboTermDefinitionPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermIdEditorPortlet.class.getName())) {
                entityPortlet = oboTermIdEditorPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermSynonymsPortlet.class.getName())) {
                entityPortlet = oboTermSynonymsPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermCrossProductPortlet.class.getName())) {
                entityPortlet = oboTermCrossProductPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OBOTermXRefsEditorPortlet.class.getName())) {
                entityPortlet = oboTermXRefsEditorPortletProvider.get();
            }
            else if (portletJavaClassName.equals(RevisionsPortlet.class.getName())) {
                entityPortlet = revisionsPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OntologyIdPortlet.class.getName())) {
                entityPortlet = ontologyIdPortletProvider.get();
            }
            else if (portletJavaClassName.equals(OntologyAnnotationsPortlet.class.getName())) {
                entityPortlet = ontologyAnnotationsPortletProvider.get();
            }
            else if (portletJavaClassName.equals(ProjectFeedPortlet.class.getName())) {
                entityPortlet = projectFeedPortletProvider.get();
            }
            else if (portletJavaClassName.equals(DiscussionThreadPortlet.class.getName())) {
                entityPortlet = discussionThreadPortletProvider.get();
            }
            else if (portletJavaClassName.equals(EditorPortlet.class.getName())) {
                entityPortlet = editorPortletProvider.get();
            }
            else if (portletJavaClassName.equals(UsagePortlet.class.getName())) {
                entityPortlet = usagePortletProvider.get();
            } else if (portletJavaClassName.equals(OWLEntityDescriptionBrowserPortlet.class.getName())) {
                entityPortlet = entityDescriptionBrowserPortletProvider.get();
            }
            else if (portletJavaClassName.endsWith(OWLEntityDescriptionEditorPortlet.class.getName())) {
                entityPortlet = entityDescriptionEditorPortletProvider.get();
            }
            else {
                GWT.log("[UIFactory] Portlet not found: " + portletJavaClassName);
            }
            if(entityPortlet != null) {
                GWT.log("[UIFactory] Initialized portlet: " + portletJavaClassName);
            }
        } catch (Exception e) {
            GWT.log("[UIFactory] An error occurred when creating an instance of " + portletJavaClassName, e);
        }
        return entityPortlet;
    }

    public static List<String> getAvailablePortletNames() {
        /*
         * Removed portlets:
         * PropertyFieldPortlet.class.getName()
         * ChangeTreePortlet.class.getName(), ChangeSummaryPortlet.class.getName(), ChangeTablePortlet.class.getName(),
         * NotesPortlet.class.getName(),
         */
        String[] portlets = {OWLEntityDescriptionEditorPortlet.class.getName(), OWLEntityDescriptionBrowserPortlet
                .class.getName(), UsagePortlet.class.getName(), OntologyIdPortlet.class.getName(),
                OntologyAnnotationsPortlet.class.getName(), EditorPortlet.class.getName(),
                DiscussionThreadPortlet.class.getName(), ProjectHistoryPortlet.class.getName(),
                ProjectFeedPortlet.class.getName(),
                ClassTreePortlet.class.getName(), ImportsTreePortlet.class.getName(),
                IndividualsListPortlet.class.getName(), MetricsPortlet.class.getName(),
                PropertiesTreePortlet.class.getName(),
                EntityChangesPortlet.class.getName(), WatchedEntitiesPortlet.class.getName(),
                OBOTermCrossProductPortlet.class.getName(),
                OBOTermRelationshipPortlet.class.getName(), OBOTermSynonymsPortlet.class.getName(),
                OBOTermIdEditorPortlet.class.getName(),
                OBOTermDefinitionPortlet.class.getName(), OBOTermXRefsEditorPortlet.class.getName(),
                RevisionsPortlet.class.getName()};

        List<String> portletsList = Arrays.asList(portlets);
        Collections.sort(portletsList, new Comparator<String>() {
            public int compare(String p1, String p2) {
                String n1 = p1.substring(p1.lastIndexOf(".") + 1);
                String n2 = p2.substring(p2.lastIndexOf(".") + 1);
                return n1.compareTo(n2);
            }
        });
        return portletsList;
    }


    /**
     * @return A map from the short names of the portlets to the full java class
     * name of the portlets.
     */
    public static Map<String, String> getAvailablePortletNameMap() {
        List<String> portlets = getAvailablePortletNames();
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (String portlet : portlets) {
            map.put(getPortletShortName(portlet), portlet);
        }
        return map;
    }

    /**
     * Extracts a short human readable name from a portlet java class name.
     *
     * @param portletClassName The fully qualified class name for the portlet
     * @return The short name for the portlet (not null).
     */
    private static String getPortletShortName(String portletClassName) {
        int simpleNameSeparator = portletClassName.lastIndexOf(".");
        if (simpleNameSeparator == -1) {
            return portletClassName;
        }
        String simpleName = portletClassName.substring(simpleNameSeparator + 1);
        String strippedName;
        if (simpleName.endsWith(PORTLET_SUFFIX)) {
            strippedName = simpleName.substring(0, simpleName.length() - PORTLET_SUFFIX.length());
        }
        else {
            strippedName = simpleName;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strippedName.length(); i++) {
            char ch = strippedName.charAt(i);
            boolean upperCase = Character.isUpperCase(ch);
            if (upperCase) {
                if (isNextCharacterLowerCase(strippedName, i) || isPreviousCharacterLowerCase(strippedName, i)) {
                    sb.append(" ");
                }
            }
            sb.append(ch);
        }
        return sb.toString().trim();
    }

    private static boolean isPreviousCharacterLowerCase(String strippedName, int i) {
        return i > 0 && Character.isLowerCase(strippedName.charAt(i - 1));
    }

    private static boolean isNextCharacterLowerCase(String s, int currentIndex) {
        return currentIndex < s.length() - 1 && Character.isLowerCase(s.charAt(currentIndex + 1));
    }

}
