package CreationalPattern.FactoryMethodPattern.Bill;

public class GetPlanFactory {
    //use getPlan method to get object of type plan
    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}//end of GetPlanFactory class
