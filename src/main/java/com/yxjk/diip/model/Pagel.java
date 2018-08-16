package com.yxjk.diip.model;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class Pagel {
    private Integer pageSize;

    private Integer currentPage;

    private String sortBy;

    private String order;

    public Pageable getPageableInstance(){
        Sort sort = new Sort(Sort.Direction.fromString(order.toUpperCase().replace("ENDING","")), sortBy);
        return PageRequest.of(currentPage-1, pageSize, sort);
    }
}
