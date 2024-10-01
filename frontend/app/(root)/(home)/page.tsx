import ArticleCard from "@/components/shared/ArticleCard";
import CardsCarousel from "@/components/shared/CardsCarousel";

const infoPrueba = [
    {
        title: "Zanella Ceccato 150R",
        description: "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Recusandae nesciunt neque temporibus. Ipsa a accusamus cumque sunt beatae facere! In!",
        value: 1850000,
        date: new Date('2024-09-30'),
        imageUrl: "/images/prueba/ceccato.jpg"
    },
    {
        title: "Sillon",
        description: "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Recusandae nesciunt neque temporibus. Ipsa a accusamus cumque sunt beatae facere! In!",
        value: 23500,
        date: new Date('2024-09-30'),
        imageUrl: "/images/prueba/sillon.jpeg"
    },
    {
        title: "Royal Enfield",
        description: "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Recusandae nesciunt neque temporibus. Ipsa a accusamus cumque sunt beatae facere! In!",
        value: 9850000,
        date: new Date('2024-09-30'),
        imageUrl: "/images/prueba/ceccato150.jpg"
    },
    {
        title: "Piano",
        description: "Lorem ipsum dolor, sit amet conse",
        value: 12200000,
        date: new Date('2024-09-30'),
        imageUrl: "/images/prueba/piano.jpg"
    },
]

export default function Home() {

    return (
        <>
            <h3 className="text-3xl">Trending</h3>
            <section className="flex gap-4 flex-wrap">
                {
                    infoPrueba.map((item, index) => (
                        <ArticleCard
                        key={index}
                        title={item.title}
                        description={item.description}
                        value={item.value}
                        date={item.date}
                        imageUrl={item.imageUrl}
                        variant="resume"
                        />
                    ))
                }
            </section>

            <CardsCarousel/>
        </>
    );
}
