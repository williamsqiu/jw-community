package org.joget.apps.app.model;

import org.joget.plugin.property.model.PropertyEditable;

public interface HashVariablePlugin extends PropertyEditable {

    public abstract String getPrefix();

    public abstract String processHashVariable(String variableKey);
    
    public String escapeHashVariable(String variable);
}
