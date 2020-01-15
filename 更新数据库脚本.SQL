/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : cyjc

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 14/01/2020 14:18:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;



-- ----------------------------
-- 2020/1/14 新建开票信息表
-- ----------------------------
DROP TABLE IF EXISTS `wf_billing`;
CREATE TABLE `wf_billing`  (
  `pk_billing` int(11) NOT NULL AUTO_INCREMENT COMMENT '开票主键',
  `pk_finished` int(11) DEFAULT NULL COMMENT '成品主键',
  `invoice_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '发票号',
  `bill_number` int(11) DEFAULT NULL COMMENT '数量',
  `bill_money` decimal(10, 2) DEFAULT NULL COMMENT '金额',
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件名称',
  `filefullnam` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件路径',
  `bill_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:申请开票,2:完成开票,3:暂停,4:恢复',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_billing`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建DIP生产表
-- ----------------------------
DROP TABLE IF EXISTS `wf_dip_production`;
CREATE TABLE `wf_dip_production`  (
  `pk_dip_production` int(11) NOT NULL AUTO_INCREMENT COMMENT 'DIP生产主键',
  `pk_smt_production` int(11) DEFAULT NULL COMMENT 'SMT生产主键',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `dip_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:暂停,2:恢复',
  `pickingtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '领料时间',
  `starttime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开工时间',
  `finishtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '完工时间',
  `numbertime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '总工时',
  `completion_number` int(11) DEFAULT NULL COMMENT '完工数量',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_dip_production`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建成品信息表
-- ----------------------------
DROP TABLE IF EXISTS `wf_finished`;
CREATE TABLE `wf_finished`  (
  `pk_finished` int(11) NOT NULL AUTO_INCREMENT COMMENT '成品主键',
  `pk_dip_production` int(11) DEFAULT NULL COMMENT 'DIP生产主键',
  `Serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '序列号段',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `qc_number` int(11) DEFAULT NULL COMMENT '质检数量',
  `pass_number` int(11) DEFAULT NULL COMMENT '合格数量',
  `pass_rate` decimal(6, 2) DEFAULT NULL COMMENT '合格率',
  `put_number` int(11) DEFAULT 0 COMMENT '入库数量',
  `output_number` int(11) DEFAULT 0 COMMENT '出库数量',
  `accumulation` int(11) DEFAULT 0 COMMENT '累计数量',
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件名称',
  `filefullnam` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件路径',
  `fin_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:暂停,2:恢复',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_finished`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建物料质检表
-- ----------------------------
DROP TABLE IF EXISTS `wf_material_qc`;
CREATE TABLE `wf_material_qc`  (
  `pk_material_qc` int(11) NOT NULL AUTO_INCREMENT COMMENT '来料质检主键',
  `pk_procuremen` int(11) DEFAULT NULL COMMENT '采购主键',
  `qc_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:未质检,2:已质检,3:暂停,4:恢复',
  `qc_explain` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '质检说明',
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件名称',
  `filefullnam` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件路径',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_material_qc`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建物料采购表
-- ----------------------------
DROP TABLE IF EXISTS `wf_procurement`;
CREATE TABLE `wf_procurement`  (
  `pk_procurement` int(11) NOT NULL AUTO_INCREMENT COMMENT '物料采购主键',
  `pk_warehouse` int(11) DEFAULT NULL COMMENT '库房主键',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `pr_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:暂停，2:恢复',
  `estimated_finish_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '预计完成时间',
  `actual_finish_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实际完成时间',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_procurement`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建生产计划表
-- ----------------------------
DROP TABLE IF EXISTS `wf_production`;
CREATE TABLE `wf_production`  (
  `pk_production` int(11) NOT NULL AUTO_INCREMENT COMMENT '生产计划主键',
  `pk_product` int(11) DEFAULT NULL COMMENT '订单主键',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `workshop` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '生产车间',
  `estimated_start_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '预计开始时间',
  `estimated_end_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '预计完工时间',
  `actual_start_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实际开始时间',
  `actual_end_time` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '实际结束时间',
  `estimated_number` int(11) DEFAULT NULL COMMENT '预计数量',
  `actual_number` int(11) DEFAULT NULL COMMENT '实际数量',
  `wf_state` int(11) DEFAULT 0 COMMENT '状态：0自由态，1，未开始，2进行中，3暂停中，4已完成',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_production`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建SMT生产表
-- ----------------------------
DROP TABLE IF EXISTS `wf_smt_production`;
CREATE TABLE `wf_smt_production`  (
  `pk_smt_production` int(11) NOT NULL AUTO_INCREMENT COMMENT 'SMT生产主键',
  `pk_warehousing` int(11) DEFAULT NULL COMMENT '物料主键',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `smt_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:暂停,2:恢复',
  `pickingtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '领料时间',
  `starttime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '开工时间',
  `finishtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '完工时间',
  `numbertime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '总工时',
  `production_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '产线名称',
  `completion_number` int(11) DEFAULT NULL COMMENT '完工数量',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_smt_production`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建库房备料表
-- ----------------------------
DROP TABLE IF EXISTS `wf_warehouse`;
CREATE TABLE `wf_warehouse`  (
  `pk_warehouse` int(11) NOT NULL AUTO_INCREMENT COMMENT '库房备料主键',
  `pk_production` int(11) DEFAULT NULL COMMENT '生产计划主键',
  `wh_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态 1：MPR确认 2：物料到货 3：暂停',
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件名称',
  `filefullnam` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件路径',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiedtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_warehouse`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- 2020/1/14 新建物料入库表
-- ----------------------------
DROP TABLE IF EXISTS `wf_warehousing`;
CREATE TABLE `wf_warehousing`  (
  `pk_warehousing` int(11) NOT NULL AUTO_INCREMENT COMMENT '料物入库主键',
  `material_qc` int(11) DEFAULT NULL COMMENT '物料质检主键',
  `process` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '工序',
  `w_state` int(11) DEFAULT 0 COMMENT '状态 0:自由态,1:暂停,2:恢复',
  `filefullnam` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件路径',
  `filename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '附件名称',
  `creator` int(11) DEFAULT NULL COMMENT '创建人',
  `creationtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '创建时间',
  `modifier` int(11) DEFAULT NULL COMMENT '最后修改人',
  `modifiertime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '最后修改时间',
  `dr` int(11) DEFAULT 0 COMMENT '删除标志',
  `ts` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '时间戳',
  PRIMARY KEY (`pk_warehousing`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 2020/1/14 新增bill_product_order_h字段
-- ----------------------------
ALTER TABLE `bill_product_order_h` ADD COLUMN `order_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '0:自由态,1:生产订单,2:OEM,3:DEM,4:贸易模式' AFTER `urgent`;
ALTER TABLE `bill_product_order_h` ADD COLUMN `scheduledtime` char(19) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '预计交货时间' AFTER `payment_type`;