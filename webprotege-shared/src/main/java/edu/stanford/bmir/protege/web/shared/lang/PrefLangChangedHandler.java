package edu.stanford.bmir.protege.web.shared.lang;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 29 Jul 2018
 */
public interface PrefLangChangedHandler {

    void handlePrefLangChanged(@Nonnull DisplayLanguageChangedEvent event);
}
