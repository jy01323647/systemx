package com.sysmex.declaration.service;
import com.sysmex.declaration.entity.TaaediDeclarationMainEntity;
import com.sysmex.declaration.entity.TaaediDeclarationPackDetailEntity;
import com.sysmex.declaration.entity.TaaediDeclarationDetailEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TaaediDeclarationMainServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TaaediDeclarationMainEntity taaediDeclarationMain,
	        List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList,List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TaaediDeclarationMainEntity taaediDeclarationMain,
	        List<TaaediDeclarationPackDetailEntity> taaediDeclarationPackDetailList,List<TaaediDeclarationDetailEntity> taaediDeclarationDetailList);
	public void delMain (TaaediDeclarationMainEntity taaediDeclarationMain);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediDeclarationMainEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediDeclarationMainEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediDeclarationMainEntity t);
}
