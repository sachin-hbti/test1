package com.altisource.lrm.vault.api.pojo;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({
"rows"
})
public class Data {

@JsonProperty("rows")
private List<Row> rows = new ArrayList<Row>();

/**
* 
* @return
* The rows
*/
public List<Row> getRows() {
return rows;
}

/**
* 
* @param rows
* The rows
*/

public void setRows(List<Row> rows) {
this.rows = rows;
}


}