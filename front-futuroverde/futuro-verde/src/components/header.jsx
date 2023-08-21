import Link from "next/link";

export default function Header() {

   
    return (
        <nav className="bg-black p-6 flex justify-between items-center">
            <div className="h-12 w-44 ml-11">
                <img src="https://cdn.discordapp.com/attachments/1021132314446672003/1143265600769106040/templatelogo.png" alt="futuroverde" />
            </div>
            
            <ul className="flex gap-14 items-end text-green-300 text-sm mr-12">
                <li>
                    <Link className="text-green-500" href="">
                    Home
                    </Link>
                </li>

                <li>
                    <Link className="text-green-500" href="/receitas">
                    Receitas
                    </Link>
                </li>
                <li>
                    <Link className="text-green-500" href="/login">
                    Login
                    </Link>
                </li>
                <li>
                    <Link className="text-green-500" href="/register">
                    Register
                    </Link>
                </li>
            </ul>

            
        </nav>
    )
}