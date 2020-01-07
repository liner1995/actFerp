import request from '@/utils/request'


// 分页查询所有产品信息
export function listProductCustomer(data) {
    return request({
        url: '/product/selectProductCustomerAsPage',
        method: 'post',
        data
    })
}