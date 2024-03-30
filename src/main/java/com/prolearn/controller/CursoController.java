package com.prolearn.controller;

import com.prolearn.domain.Curso;
import com.prolearn.service.CursoService;
import com.prolearn.service.FirebaseStorageService;
import com.prolearn.service.Impl.FirebaseStorageServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private FirebaseStorageServiceImpl FirebaseStorageService;

}
