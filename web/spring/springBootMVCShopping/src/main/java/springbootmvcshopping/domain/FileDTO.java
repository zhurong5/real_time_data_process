package springbootmvcshopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("")
public class FileDTO {
	String orgFile;
	String storeFile;
}
