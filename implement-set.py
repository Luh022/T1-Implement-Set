class SetImplementation:
    def __init__(self):
        self.set = set()

    def add(self, element):
        self.set.add(element)

    def remove(self, element):
        self.set.discard(element)

    def contains(self, element):
        return element in self.set

if __name__ == "__main__":
    setImpl = SetImplementation()
    setImpl.add(5)
    setImpl.add(10)
    setImpl.add(5)

    print("Contains 5:", setImpl.contains(5))  # True
    print("Contains 15:", setImpl.contains(15))  # False

    setImpl.remove(10)
    print("Contains 10 after removal:", setImpl.contains(10))  # False
