package com.dev.vault.service.interfaces;

import com.dev.vault.helper.payload.group.ProjectDto;

public interface ProjectManagementService {
    ProjectDto createProject(ProjectDto projectDto);
}