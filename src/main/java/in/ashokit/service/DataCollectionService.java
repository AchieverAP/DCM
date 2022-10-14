package in.ashokit.service;

import in.ashokit.bindings.EducationRequestBindings;
import in.ashokit.bindings.IncomeRequestBinding;
import in.ashokit.bindings.KidRequestBinding;
import in.ashokit.bindings.PlanRequestBinding;
import in.ashokit.entity.Case;
import in.ashokit.entity.Education;
import in.ashokit.entity.Income;

public interface DataCollectionService {

	public Long createCase(Integer appId);
	
	public Case collectPlanData(PlanRequestBinding plandata);
	
	public Income collectIncomeDetails(IncomeRequestBinding incomeData);
	
	public Education collectEducationDetails(EducationRequestBindings educationData);
	
	public boolean collectKidsDetails(KidRequestBinding kidsData);
}
