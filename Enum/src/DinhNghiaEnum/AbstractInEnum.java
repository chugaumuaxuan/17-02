package DinhNghiaEnum;

interface Activities{
	void Doing();
}

public class AbstractInEnum {
	enum list implements Activities  {
		tao{
			void display() {}

			public void Doing() {}
		},
		oi{
			void display() {}

			public void Doing() {}
		},
		cam{
			void display() {}

			public void Doing() {}
		},
		dao{
			void display() {}

			public void Doing() {}
		};
			
		abstract void display();
	
	}
}
