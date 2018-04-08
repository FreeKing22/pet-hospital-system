package com.cui.phs.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cui.phs.entity.DiseaseEntity;
import com.cui.phs.entity.ImageEntity;
import com.cui.phs.service.facade.DiseaseService;

@Controller
@RequestMapping({"/disease"})
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseServiceImpl;

    public DiseaseController() {
    }

    @RequestMapping(
            value = {"/listByKind/{id}"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public Map<String, Object> listDiseaseByKind(@PathVariable("id") int kindId) throws IOException {
        Map<String, Object> map = new HashMap();
        List result = null;

        try {
            result = this.diseaseServiceImpl.listDiseaseByKind(kindId);
            if (result != null) {
                map.put("succeed", true);
                map.put("code", Integer.valueOf(200));
                map.put("data", result);
            } else {
                map.put("succeed", false);
                map.put("code", Integer.valueOf(300));
                map.put("data", "查询失败!");
            }
        } catch (Exception var5) {
            map.put("succeed", false);
            map.put("code", Integer.valueOf(500));
            map.put("data", var5.getMessage());
        }

        return map;
    }

    @RequestMapping(
            value = {"/findDisease/{id}"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public Map<String, Object> findDisease(@PathVariable("id") int id) throws IOException {
        Map<String, Object> map = new HashMap();
        DiseaseEntity result = null;

        try {
            result = this.diseaseServiceImpl.findDisease(id);
            if (result != null) {
                map.put("succeed", true);
                map.put("code", Integer.valueOf(200));
                map.put("data", result);
            } else {
                map.put("succeed", false);
                map.put("code", Integer.valueOf(300));
                map.put("data", "查询失败!");
            }
        } catch (Exception var5) {
            map.put("succeed", false);
            map.put("code", Integer.valueOf(500));
            map.put("data", var5.getMessage());
        }

        return map;
    }

    @RequestMapping(
            value = {"/findImage/{id}"},
            method = {RequestMethod.GET},
            produces = {"application/json;charset=UTF-8"}
    )
    @ResponseBody
    public Map<String, Object> findImage(@PathVariable("id") int id) throws IOException {
        Map<String, Object> map = new HashMap();
        ImageEntity result = null;

        try {
            result = this.diseaseServiceImpl.findImage(id);
            if (result != null) {
                map.put("succeed", true);
                map.put("code", Integer.valueOf(200));
                map.put("data", result);
            } else {
                map.put("succeed", false);
                map.put("code", Integer.valueOf(300));
                map.put("data", "查询失败!");
            }
        } catch (Exception var5) {
            map.put("succeed", false);
            map.put("code", Integer.valueOf(500));
            map.put("data", var5.getMessage());
        }

        return map;
    }
}
