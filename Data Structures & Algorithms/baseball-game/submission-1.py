class Solution:
    def calPoints(self, operations: List[str]) -> int:
        record: list[int] = []

        for i in operations:
            if i.lstrip("-").isdigit():
                record.append(int(i))
            elif i == "D":
                record.append(2 * record[-1])
            elif i == "+":
                record.append(record[-1] + record[-2])
            elif i == "C":
                record.pop()

        return sum(record)