package edu.multi.kdigital;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper //마이바티스 sql 실행(id, resulttype, parameter타입)
@Repository("mybatisdao")
public interface MemberDAO {	
	public List<MemberDTO> memberlist();	
	public int insertmember(MemberDTO dto);	
	public int updatemember(MemberDTO dto);	
	public int deletemember(String id);	
	public MemberDTO member(String id);
	public List<MemberDTO> paginglist(int[] page);	
	public List<String> addresssearch(String[] address);	
}
