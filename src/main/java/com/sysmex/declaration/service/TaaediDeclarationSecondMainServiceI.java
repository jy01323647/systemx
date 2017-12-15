package com.sysmex.declaration.service;
import com.sysmex.declaration.entity.TaaediDeclarationSecondMainEntity;
import com.sysmex.declaration.entity.TaaediDeclarationSecondPacklistEntity;
import com.sysmex.declaration.entity.TaaediDeclarationSecondDetailEntity;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TaaediDeclarationSecondMainServiceI extends CommonService{
	
 	public <T> void delete(T entity);
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain,
	        List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistList,List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailList) ;
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain,
	        List<TaaediDeclarationSecondPacklistEntity> taaediDeclarationSecondPacklistList,List<TaaediDeclarationSecondDetailEntity> taaediDeclarationSecondDetailList);
	public void delMain (TaaediDeclarationSecondMainEntity taaediDeclarationSecondMain);
	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(TaaediDeclarationSecondMainEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(TaaediDeclarationSecondMainEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(TaaediDeclarationSecondMainEntity t);
}
