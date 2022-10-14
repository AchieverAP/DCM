package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_INCOME")
@Data
public class Income {

	@Id
	private Integer	incomeId;		
	private Integer   caseNo;		
	private Integer empIncome;		
	private Integer propertyIncome;
}
