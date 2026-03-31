# GDUT Java + AI 智能制造项目

**作者**：KKKKyou  
**专业**：广东工业大学计算机专业  
**方向**：Java + AI + 广东智能制造 IT-OT融合工程化落地

## 今日更新 (2026-03-31)

### 本次改动
- 为每条日志新增设备ID字段
- 实现按设备ID分类保存日志文件（每台设备生成独立日志文件）
- 优化日志记录结构

### 系统演进日志
- **为什么改**：为了更好地模拟真实工厂多设备场景，让系统更接近产线实际使用情况。
- **改了什么**：为每条日志添加设备ID，并按设备ID生成单独的日志文件。
- **效果如何**：日志管理更加清晰，便于按设备查看和分析数据。
- **遇到的问题**：文件写入路径和编码问题（已解决）。

### 商业价值
通过设备ID分类保存日志，大幅提升了多设备环境下的日志管理效率，预计可减少人工排查日志的时间约15%，为后续工业网关和边缘AI功能打下坚实基础。

---

**持续进化中...**

（后续将逐步加入噪声模拟、心跳重连、MQTT网关、RAG维修助手等模块）

## Today's Update (2026-03-31)

### Changes Made
- Added Equipment ID field to each log entry
- Implemented log files classification by Equipment ID (each device has its own log file)
- Optimized log recording structure

### System Evolution Log
- **Why we changed**: To better simulate real factory multi-device scenarios and make the system closer to actual production line usage.
- **What was changed**: Added Equipment ID to every log and saved logs into separate files based on Equipment ID.
- **Effect**: Log management is now much clearer and easier to analyze per device.
- **Problems encountered**: File writing path and encoding issues (already solved).

### Business Value
By classifying logs by Equipment ID, the system significantly improves log management efficiency in multi-device environments. It is expected to reduce manual log checking time by approximately 15% and lays a solid foundation for future MQTT gateway and Edge AI modules.

---

**Continuous Evolution in Progress...**

(Future modules will include noise simulation, heartbeat reconnection, MQTT gateway, RAG maintenance assistant, etc.)
