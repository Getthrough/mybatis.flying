package indi.mybatis.flying.mapper2;

import java.util.Collection;

import indi.mybatis.flying.pojo.Role2_;
import indi.mybatis.flying.pojoHelper.MapperFace;

//@CacheRoleAnnotation(ObserverClass = {}, TriggerClass = { Role_.class })
public interface Role2Mapper extends MapperFace<Role2_> {

	@Override
	// @CacheAnnotation(role = CacheRoleType.Observer)
	public Role2_ select(Object id);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Observer)
	public Collection<Role2_> selectAll(Role2_ t);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Observer)
	public Role2_ selectOne(Role2_ t);

	@Override
	public void insert(Role2_ t);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Trigger)
	public int update(Role2_ t);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Trigger)
	public int updatePersistent(Role2_ t);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Trigger)
	public int delete(Role2_ t);

	@Override
	// @CacheAnnotation(role = CacheRoleType.Observer)
	public int count(Role2_ t);

	// public void loadAccount(Role_ role, Account_ account);
	//
	// public void loadAccountDeputy(Role_ roleDeputy, Account_ accountDeputy);
}
