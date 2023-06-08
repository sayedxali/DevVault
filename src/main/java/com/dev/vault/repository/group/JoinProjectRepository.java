package com.dev.vault.repository.group;

import com.dev.vault.model.group.JoinProject;
import com.dev.vault.model.group.enums.JoinStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JoinProjectRepository extends JpaRepository<JoinProject, Long> {
    List<JoinProject> findByProject_ProjectIdAndStatus(Long projectId, JoinStatus status);
    Optional<JoinProject> findByProject_ProjectName(String projectName);
}