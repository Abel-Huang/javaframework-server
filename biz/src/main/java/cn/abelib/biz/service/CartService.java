package cn.abelib.biz.service;


import cn.abelib.st.core.result.Response;
import cn.abelib.biz.vo.CartVo;

/**
 *
 * @author abel
 * @date 2017/11/15
 */
public interface CartService {
    Response<CartVo> add(Integer userId, Integer productId, Integer count);

    Response<CartVo> update(Integer userId, Integer productId, Integer count);

    Response<CartVo> delete(Integer userId, String productIds);

    Response<CartVo> list(Integer userId);

    Response<CartVo> selectOrUnselectAll(Integer userId, Integer checked);

    Response<CartVo> selectOrUnselect(Integer userId, Integer productId, Integer checked);

    Response<Integer> getCartProductCount(Integer userId);
}
