import request from '@/utils/request'


// 分页查询所有产品信息
export function listProductCustomer(data) {
    return request({
        url: '/product/selectProductCustomerAsPage',
        method: 'post',
        data
    })  
}

// 分页查询所有产品信息
export function listProduction(data) {
    return request({
        url: '/production/selectAllProductionAsPage',
        method: 'post',
        data
    })
}
    
// 添加生产计划
export function insertProduction(data) {
    return request({
        url: '/production/insertProduction',
        method: 'post',
        data
    })  
}

// 根据主键生产计划
export function deleteProductionByPks(data) {
    return request({
        url: '/production/deleteProductionByPks',
        method: 'post',
        data
    })  
}

// 修改生产计划
export function updateProduction(data) {
    return request({
        url: '/production/updateProduction',
        method: 'post',
        data
    })  
}