package com.example.springboothello.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassificationTest {
    public static void main(String[] args) {
        List<Candidate> list = new ArrayList<Candidate>();
        list.add(new Candidate("1","1","机构一"));//机构id,考生id，机构名称。
        list.add(new Candidate("1","2","机构一"));
        list.add(new Candidate("2","3","机构二"));
        list.add(new Candidate("2","4","机构二"));
        list.add(new Candidate("3","5","机构三"));
        list.add(new Candidate("3","6","机构三"));
        list.add(new Candidate("4","7","机构四"));
        list.add(new Candidate("4","8","机构四"));

        Map<String, List<Candidate>> map = list.stream().collect(Collectors.groupingBy(
                Candidate::getOrgId));
        System.out.println(map.toString());
    }

}
