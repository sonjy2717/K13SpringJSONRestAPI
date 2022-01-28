package mybatis;

import java.util.ArrayList;

import lombok.Data;

@Data
public class ParameterDTO {
	private String num; //게시물의 일련번호
	private String searchField;	//검색어 필드
	private ArrayList<String> searchTxt; //검색어(2개 이상을 처리하기 위해 List컬렉션 사용)
	private int start; //출력할 게시물의 구간 설정
	private int end; //출력할 게시물의 구간 설정
}
