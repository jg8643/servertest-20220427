package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {
	@RequestMapping(value="/fileupload", method = RequestMethod.GET)
	public String uploadform() {
		return "upload/uploadform";
	}
	
	@RequestMapping(value="/fileupload", method = RequestMethod.POST)
	public String uploadresult(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		//${dto.file1.originalFilename} ����Ϸ� ǥ��
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		System.out.println(mf1.getOriginalFilename()); //multipartfile toString �޼ҵ� �������̵� ���� �ʾҴٸ� ��Ű����.Ŭ������@16���� �ּ�
		System.out.println(mf2.getOriginalFilename());
		System.out.println(mf1.getSize());
		System.out.println(mf2.getSize());
		System.out.println(mf1.isEmpty());
		System.out.println(mf2.isEmpty());
		
		//���ϳ���+���ϸ� -> ���� c:/upload ���� ���� ����
		String savePath = "c:/upload/";
		
		if(!mf1.isEmpty()) {
			//�������ϸ�
			String originname1 = mf1.getOriginalFilename();
			//Ȯ���� �������ϸ�
			String beforeext1 = originname1.substring(0, originname1.indexOf("."));
			//Ȯ���� �������ϸ�
			String ext1 = originname1.substring(originname1.indexOf("."));
			File serverfile1 = new File(savePath + beforeext1 + "(" + UUID.randomUUID().toString()+ ")" + ext1);
			dto.getFile1().transferTo(serverfile1);
		}
		if(!mf2.isEmpty()) {
			String originname2 = mf2.getOriginalFilename();
			String beforeext2 = originname2.substring(0, originname2.indexOf("."));
			String ext2 = originname2.substring(originname2.indexOf("."));
			File serverfile2 = new File(savePath + beforeext2 + "(" + UUID.randomUUID().toString().substring(0, 5)+ ")" + ext2);
			dto.getFile2().transferTo(serverfile2);
		}
				
		//System.out.println(UUID.randomUUID().toString().substring(0, 5)); ���ϸ� ����, 5���ڱ���
		//System.out.println(UUID.randomUUID().toString().substring(0, 5));		
		
		return "upload/uploadresult";
	}
}