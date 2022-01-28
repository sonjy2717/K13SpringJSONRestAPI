package mybatis;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO {
	private String num;
	private String title;
	private String content;
	private String id;
	private Date postdate;
	private String visitcount;
}
