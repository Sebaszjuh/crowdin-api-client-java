package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.languages.model.Language;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Project {

    private Long id;
    private Long groupId;
    private Long userId;
    private String sourceLanguageId;
    private List<String> targetLanguageIds;
    private String name;
    private String identifier;
    private String description;
    private String logo;
    private String background;
    private boolean isExternal;
    private String externalType;
    private Long workflowId;
    private boolean hasCrowdsourcing;
    private boolean publicDownloads;
    private Date createdAt;
    private Date updatedAt;
    private Date lastActivity;
    private List<Language> targetLanguages;

}
