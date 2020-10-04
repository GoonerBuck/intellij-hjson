package com.github.goonerbuck.intellijhjson.services

import com.intellij.openapi.project.Project
import com.github.goonerbuck.intellijhjson.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
