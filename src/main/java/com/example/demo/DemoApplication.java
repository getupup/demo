package com.example.demo;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
@RestController
@RequestMapping("/esTest")
public class DemoApplication {
//
//    @Autowired
//    private TransportClient client;
//
//    @GetMapping("/getById")
//    @ResponseBody
//    public ResponseEntity get(@RequestParam(name = "id", defaultValue = "") String id){
//        if (id.isEmpty()){
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//
//        GetResponse response = this.client.prepareGet("one", "people", id).get();
//
//        if (! response.isExists()){
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity(response.getSource(), HttpStatus.OK);
//    }
//
//    @PostMapping("/add")
//    @ResponseBody
//    public ResponseEntity add(
//            @RequestParam(name = "name") String name,
//            @RequestParam(name = "age") int age,
//            @RequestParam(name = "pid") int pid,
//            @RequestParam(name = "birth") String birth){
//        try {
//            XContentBuilder content = XContentFactory.jsonBuilder()
//                    .startObject()
//                    .field("name", name)
//                    .field("age", age)
//                    .field("birth", birth)
//                    .field("p_id", pid)
//                    .endObject();
//
//            IndexResponse result = this.client.prepareIndex("one", "people")
//                    .setSource(content)
//                    .get();
//
//            return new ResponseEntity(result.getId(), HttpStatus.OK);
//
//        } catch (IOException e){
//            e.printStackTrace();
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/deleteById")
//    @ResponseBody
//    public ResponseEntity delete(@RequestParam(name = "id", defaultValue = "") String id){
//        DeleteResponse result = this.client.prepareDelete("people", "man", id).get();
//
//        return new ResponseEntity(result.getResult().toString(), HttpStatus.OK);
//    }
//
//    @PutMapping("/update")
//    @ResponseBody
//    public ResponseEntity update(
//            @RequestParam(name = "id") String id,
//            @RequestParam(name = "name", required = false) String name,
//            @RequestParam(name = "age", required = false) Integer age,
//            @RequestParam(name = "desc", required = false) String desc){
//
//        UpdateRequest request = new UpdateRequest("people", "man", id);
//
//        try {
//            XContentBuilder builder = XContentFactory.jsonBuilder().startObject();
//
//            if (name != null) {
//                builder.field("name", name);
//            }
//            if (age != null) {
//                builder.field("age", age);
//            }
//            if (desc != null) {
//                builder.field("desc", desc);
//            }
//
//            builder.endObject();
//            request.doc(builder);
//
//            try {
//                UpdateResponse result = this.client.update(request).get();
//                return new ResponseEntity(result.getResult().toString(), HttpStatus.OK);
//            } catch (Exception e){
//                e.printStackTrace();
//                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        } catch (IOException e){
//            e.printStackTrace();
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/query")
//    @ResponseBody
//    public ResponseEntity query(
//            @RequestParam(name = "name", required = false) String name,
//            @RequestParam(name = "age", required = false) Integer age,
//            @RequestParam(name = "desc", required = false) String desc
//    ){
//        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
//
//        if (name != null){
//            boolQuery.must(QueryBuilders.matchQuery("name", name));
//        }
//
//        if (age != null){
//            boolQuery.must(QueryBuilders.matchQuery("age", age));
//        }
//
//        if (desc != null){
//            boolQuery.must(QueryBuilders.matchQuery("desc", desc));
//        }
//
//        SearchRequestBuilder builder = this.client.prepareSearch("people")
//                .setTypes("man")
//                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
//                .setQuery(boolQuery)
//                .setFrom(0)
//                .setSize(5);
//
//        System.out.println(builder);
//
//        SearchResponse response = builder.get();
//        List<Map<String, Object>> result = new ArrayList<>();
//
//        for (SearchHit hit : response.getHits()){
//            result.add(hit.getSourceAsMap());
//        }
//
//        return new ResponseEntity(result, HttpStatus.OK);
//    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

