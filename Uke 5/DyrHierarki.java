interface erPatteDyr {}

interface HarPels extends erPatteDyr {}

class Dyr {}

class Hund extends Dyr implements HarPels {}

class Katt extends Dyr implements HarPels {}

class Havdyr extends Dyr {}

class Hval extends Havdyr implements erPatteDyr {}

class Fisk extends Havdyr {}
