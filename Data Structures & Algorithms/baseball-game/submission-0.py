class Solution:
    def calPoints(self, operations: List[str]) -> int:
        record: list[int] = []
        for i in operations:
            if i.lstrip("-").isdigit():
                record.append(int(i))
            elif i.lower() == "d" and len(record) >= 1:
                 record.append(2 * record[-1])
            elif i.lower() == "+" and len(record) >= 2:
                record.append(record[-1] + record[-2])
            elif i.lower() == "c" and len(record) >= 1:
                record.pop()
            else:
                record.append(int(i))
        return sum(record)

