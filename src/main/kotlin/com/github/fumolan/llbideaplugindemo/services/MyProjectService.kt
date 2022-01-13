package com.github.fumolan.llbideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.fumolan.llbideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
