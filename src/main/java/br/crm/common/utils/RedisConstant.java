package br.crm.common.utils;

public final class RedisConstant {	
	/*
	 * *字典表    Redis常量
	 */	
	public static final String br_order_dict_payway_id = "br_order_dict_payway_id_";//支付方式
	public static final String br_order_dict_receipttype_id = "br_order_dict_receipttype_id_";//发票类型表
	public static final String br_order_dict_education_id = "br_order_dict_education_id_";// 教育程度
	public static final String br_user_relationship_id = "br_user_relationship_id_";// 人际关系
	public static final String br_order_dict_marriage_id = "br_order_dict_marriage_id_";// 婚姻状况
	public static final String br_order_dict_ageunit_id = "br_order_dict_ageunit_id_";// 年龄单位
	public static final String br_order_dict_agegroup_id = "br_order_dict_agegroup_id_";// 年龄分组(年龄分组表的id)
	public static final String br_order_dict_dictconclusion_id ="br_order_dict_dictconclusion_id_";//结论词(结论词字典表主键id)
	public static final String br_order_dict_DictConclusionDeptType_id ="br_order_dict_DictConclusionDeptType_id_";//结论词科室类型(主键id)
	public static final String br_order_dict_dictconclusiongroup_id = "br_order_dict_dictconclusiongroup_id_";//结论词分组(主键id)
	public static final String br_order_dict_dictconclusionresultclass_id = "br_order_dict_dictconclusionresultclass_id_";//结论词结果(主键id)
	//科室类型字典表
	public static final String br_order_dict_dictDeptType_id = "br_order_dict_dictDeptType_id_";//科室类型
	
	//国家字典表 Redis常量
	public static final String br_order_dict_countryManager_id = "br_order_dict_countryManager_id_";//国家字典表(国家表的id)
	public static final String br_order_dict_countryManager_name = "br_order_dict_countryManager_name_";//国家字典表(国家姓名)
	public static final String br_order_dict_countryManager_code = "br_order_dict_countryManager_code_";//国家字典表(国家代码)
	public static final String br_order_dict_countryManager_inputCode = "br_order_dict_countryManager_inputCode_";//国家字典表(国家输入码)
	public static final String br_order_dict_countryManager_lineOrder = "br_order_dict_countryManager_lineOrder_";//国家字典表(国家行序)
	//区域字典表 Redis常量
	public static final String br_order_dict_area_id = "br_order_dict_area_id_";//区域字典表(区域表的id) 
	public static final String br_order_dict_area_provinceList = "br_order_dict_area_province_list_";//区域字典表(省份id)
	public static final String br_order_dict_area_provinceId = "br_order_dict_area_provinceId_";//区域字典表(省份id)
	public static final String br_order_dict_area_cityId = "br_order_dict_area_cityId_";//区域字典表(城市id)
	public static final String br_order_dict_area_areaName ="br_order_dict_area_areaName_";//区域字典表(区域名称)
	public static final String br_order_dict_area_districtName ="br_order_dict_area_districtName_";//区域字典表(县id)	
	//血型字典表 Redis常量
	public static final String br_order_dict_bloodType_bloodTypeId = "br_order_dict_bloodType_bloodTypeId_";//血型字典表(血型id)	
	//身份字典表 Redis常量
	public static final String br_order_dict_identity_identityId = "br_order_dict_identity_identityId_";//身份字典表(身份Id)	
	//图片字典表 Redis常量
	public static final String br_order_dict_img_imgId = "br_order_dict_img_imgId_";//图片字典表(图片id)	
	//通知方式字典表 Redis常量
	public static final String br_order_dict_informWay_informWayId = "br_order_dict_informWay_informWayId_";//通知方式字典表(通知方式id)	 
	//工作类型字典表 Redis常量
	public static final String br_order_dict_jobClass_jobClassId = "br_order_dict_jobClass_jobClassId_";//工作类型字典表(工作类型id)	
	//民族字典表 Redis常量
	public static final String br_order_dict_nation_id = "br_order_dict_nation_id_";//民族字典表(民族id )	
	//职业字典表 Redis常量
	public static final String br_order_dict_occupation_occupationId = "br_order_dict_occupation_occupationId_";//职业字典表(职业id)
	//总检科室字典表 Redis常量
	public static final String br_order_dict_section_sectionId = "br_order_dict_section_sectionId_";//总检科室表(总检科室id)
	//性别字典表 Redis常量
	public static final String br_order_dict_sex_sexId = "br_order_dict_sex_sexId_";//性别字典表 (性别id)		
	//支付方式表字典表 Redis常量
	public static final String br_order_dict_payWay_payWayId = "br_order_dict_payWay_payWayId_";//支付方式字典表(支付方式的id)
	//字典表套餐类型Redis常量
	public static final String br_order_dict_examSuiteType_id = "br_order_dict_examSuiteType_id_"; //字典表-体检套餐类型-id
	//高发疾病字典表
	public static final String br_order_dict_hid_id = "br_order_dict_hid_id_"; //高发疾病表id
	//发送短信记录字典表
	public static final String br_order_dict_SMSRecord_id = "br_order_dict_SMSRecord_id_";//发送短信记录(主键id)
	public static final String br_order_dict_SMSRecord_smsPhone = "br_order_dict_SMSRecord_smsPhone_";//发送短信记录(手机号)
	//发送邮箱记录字典表
	public static final String br_order_dict_EMAILRecord_dictEmailTo = "br_order_dict_EMAILRecord_dictEmailTo_";//发送邮箱(邮件接收人)
	//人际关系字典表
	public static final String br_order_dict_relationShip_id = "br_order_dict_relationShip_id_";//人际关系字典表
	
	
	//收费项和检查项Redis常量
	public static final String br_order_orgExamFeeItemClass_id = "br_order_orgExamFeeItemClass_id_";// 收费项目分类(主键id)
	public static final String br_order_orgExamItemType_id = "br_order_orgExamItemType_id_";// 检查项类型(主键id)
	public static final String br_order_orgExamItemValue_id = "br_order_orgExamItemValue_id_";// 体证词(主键id)
	public static final String br_order_orgExamFeeItemDetail_id = "br_order_orgExamFeeItemDetail_id_";//收费项目与检查项目(主键id)
	public static final String br_order_orgExamFeeItemDetail_feeItemId = "br_order_orgExamFeeItemDetail_feeItemId_";// 收费项目与检查项目(收费项id)
	public static final String br_order_orgExamFeeItemDetail_examItemUserId = "br_order_orgExamFeeItemDetail_examItemUserId_";// 收费项目与检查项目(检查项目-用户中间表ID)
	//体检项  Redis常量
	public static final String br_order_orgExamItem_id = "br_order_orgExamItem_id_";// 检查项(体检项主键id)	
	//收费项  Redis常量
	public static final String br_order_orgExamFeeItem_id = "br_order_orgExamFeeItem_id_";// 收费项目(收费项主键id)
	//套餐--门店 Redis常量    
	public static final String br_order_orgBranchSuite_id = "br_order_orgBranchSuite_id_"; //门店套餐 (主键ID)
	public static final String br_order_orgBranchSuite_not_selectSuiteIds = "br_order_orgBranchSuite_not_selectSuiteIds_";// 门店未选择的所有套餐	
	public static final String br_order_orgBranchSuite_suiteId = "br_order_orgBranchSuite_suiteId_";// 门店套餐-套餐id
	public static final String br_order_orgBranchSuite_branchId = "br_order_orgBranchSuite_branchId_";// 门店套餐-门店id	
	//套餐-类型Redis常量
	public static final String br_order_orgExamSuiteType_id = "br_order_orgExamSuiteType_id_"; //套餐类型ID
	public static final String br_order_orgExamSuiteType_suiteId = "br_order_orgExamSuiteType_suiteid_"; //套餐类型(套餐ID)
	public static final String br_order_orgExamSuiteType_typeId = "br_order_orgExamSuiteType_typeid_"; //套餐类型(类型ID)	
	//套餐-高发疾病Redis常量
	public static final String br_order_orgExamSuiteHid_id = "br_order_orgExamSuiteHid_id_"; //套餐高发疾病表	
	public static final String br_order_orgExamSuiteHid_Hid = "br_order_orgExamSuiteHid_Hid_"; //套餐高发疾病表(高发疾病ID)
	public static final String br_order_orgExamSuiteHid_suiteid_= "br_order_orgExamSuiteHid_suiteid_"; //套餐高发疾病表(套餐ID)	
	//套餐-图片Redis常量
	public static final String br_order_orgExamSuiteImg_id = "br_order_orgExamSuiteImg_id_"; //套餐图片(主键id)
	public static final String br_order_orgExamSuiteImg_imgid = "br_order_orgExamSuiteImg_imgid_"; //套餐图片(图片ID)
	public static final String br_order_orgExamSuiteImg_suiteId = "br_order_orgExamSuiteImg_suiteId_"; //套餐图片(套餐ID)		
	//套餐
	public static final String br_order_orgExamSuite_suiteId = "br_order_orgExamSuite_suiteId_"; //套餐表(主键id)			
	//机构--机构等级Redis常量
	public static final String org_level_id = "org_level_id_"; //等级表(等级的id)
	public static final String org_level_orglevelid = "org_level_orglevelid_"; //机构表(里面的等级的id)
	//机构门店  redis常量
	public static final String br_order_organizationBranch_all_list = "br_order_organizationBranch_all_list_";//门店
	public static final String br_order_orgbranch_orgBranchId = "br_order_orgbranch_orgBranchId_"; //机构门店(主键)
	public static final String br_order_orgbranch_orgId = "br_order_orgbranch_orgId_"; //机构门店(机构id)	
	//机构d科室redis常量
	public static final String br_order_orgDept_orgDeptId = "br_order_orgDept_orgDeptId_"; //机构科室(主键)	
	//门店-休息 Redis常量
	public static final String br_order_orgBranchRest_restid = "br_order_orgBranchRest_restid_"; //休息日
	public static final String br_order_orgBranchRest_banchid = "br_order_orgBranchRest_banchid_"; //门店-休息日(门店的id)
	//门店-图片
	public static final String br_order_orgBranchimg_id = "br_order_orgBranchimg_id_"; //门店-图片中间表(主键的id)
	public static final String br_order_orgBranchimg_branchid = "br_order_orgBranchimg_banchid_"; //门店-图片中间表(门店的id)
	
	//体检套餐-收费项目表 Redis常量
	public static final String br_order_orgExamFeeItemSuite_examFISId ="br_order_orgExamFeeItemSuite_examFISId_";//体检套餐与收费项目表(主键id)
	public static final String br_order_orgExamFeeItemSuite_examFeeItemId = "br_order_orgExamFeeItemSuite_examFeeItemId_";//体检套餐与收费项目表(收费项id)
	public static final String br_order_orgExamFeeItemSuite_examSuiteId = "br_order_orgExamFeeItemSuite_examSuiteId_";//体检套餐与收费项目表(体检套餐id)
	//机构Redis常量
	public static final String br_order_organization_all_list = "br_order_organization_all_list_";//机构
	public static final String br_order_organization_valid_list = "br_order_organization_valid_list_";
	public static final String br_order_organization_id = "br_order_organization_id_";//机构id
	//体检机构-联系人表
	public static final String br_order_orgConn_orgConnId = "br_order_orgConn_orgConnId_";//联系人表(主键id)
	//体检机构-合作意向表
	public static final String br_order_orgCooperation_orgCooperationId = "br_order_orgCooperation_orgCooperationId_";//合作意向表(主键id)
	//体检机构-收入表
	public static final String br_order_orgIncome_orgIncomeId = "br_order_org_income_orgIncomeId_" ; //收入表(主键id)
	//体检机构-投资人表
	public static final String br_order_orgInvest_orgInvestId = "br_order_orgInvest_orgInvestId_" ; //投资人表(主键id)
	//体检机构-等级表
	public static final String br_order_orgLevel_orgLevelId = "br_order_orgLevel_orgLevelId_"; // 等级表(主键id)
	//体检机构-销售表
	public static final String br_order_orgSale_orgSaleId = "br_order_orgSale_orgSaleId_"; // 销售表(主键id)
	//体检机构-软件表
	public static final String br_order_orgSoft_orgSoftId = "br_order_orgSoft_orgSoftId_"; //软件表(主键id)
	//体检机构-拜访表
	public static final String br_order_orgVisit_orgVisitId = "br_order_orgVisit_orgVisitId_"; //拜访表(主键id)
	//体检机构-WEB服务表
	public static final String br_order_orgWeb_orgWebId = "br_order_orgWeb_orgWebId_"; //WEB服务表(主键id)
	
	//体检机构-用户表
	public static final String br_order_orgUser_userId = "br_order_orgUser_userId_"; //体检机构-用户表(主键id)
	public static final String br_order_orgUser_orgId = "br_order_orgUser_orgId_"; //体检机构-用户表(机构id)
	public static final String br_order_orgUser_orgBranchId = "br_order_orgUser_orgBranchId_"; //体检机构-用户表(门店id)
	public static final String br_order_orgUser_orgDeptId = "br_order_orgUser_orgDeptId_";//体检机构-用户表(科室id)
	public static final String br_order_orgUserManager_userManagerId="br_order_orgUserManager_userManagerId_";//体检机构-管理用户(管理用户id)
	//体检项-医生关联表 
	public static final String br_order_orgExamItemUser_id = "br_order_orgExamItemUser_id_"; //体检项-医生关联表(主键id)
	public static final String br_order_orgExamItemUser_userId = "br_order_orgExamItemUser_userId_"; //体检项-医生关联表(医生id)
	public static final String br_order_orgExamItemUser_itemId = "br_order_orgExamItemUser_itemId_"; //体检项-医生关联表(检查项id)
	
	//轮播图表
	public static final String br_order_orgFirstImgData_id = "br_order_orgFirstImgData_id_"; //轮播图表(主键id)
	
	//订单-购物车表
	public static final String br_customer_orderCart_id="br_customer_orderCart_id_";//订单购物车中间表（主键id）
	public static final String br_customer_orderCart_customerOrderNo="br_customer_orderCart_customerOrderNo_";//订单购物车中间表（订单号）
	//订单表
	public static final String br_customer_order_orderNo="br_customer_order_orderNo_";//订单表（订单号）
	//订单状态
	public static final String br_order_status="br_order_status_";//订单状态  7---提交订单  2-- 付款完成  5--未支付取消  6--支付取消
	//門店中城市集合
	public static final String br_order_user_city_list="br_order_user_city_list_";
} 
