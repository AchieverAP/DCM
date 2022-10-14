package in.ashokit.bindings;

import java.util.List;

import in.ashokit.entity.Children;
import lombok.Data;

@Data
public class KidRequestBinding {

	
	private Long caseNo;
	
	private List<Children> childrens;
	
}
