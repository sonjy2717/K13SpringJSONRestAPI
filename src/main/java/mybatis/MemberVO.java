package mybatis;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String pass;
	private String name;
	private Date regidate;
}
