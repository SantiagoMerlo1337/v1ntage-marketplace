import Image from "next/image"
import { Button } from "../ui/button"
import { Card, CardContent, CardDescription, CardFooter, CardHeader, CardTitle } from "../ui/card"
import { getTimestamp } from "@/lib/utils"

interface Props {
    title: string,
    description: string,
    value: number,
    date: Date,
    imageUrl: string,

    variant?: string,
}

const ArticleCard = ({title, description, value, date, imageUrl, variant}:Props) => {

  if(variant==="resume"){
    return (
      <Card className="w-48 flex flex-col">
        <CardHeader className="w-full">
          <Image src={imageUrl} width={150} height={150} alt={title} className="object-cover w-full h-36" />
        </CardHeader>
        <CardContent className="grow p-2">
            <CardTitle className="text-base text-center text-nowrap">{title}</CardTitle>
        </CardContent>
      </Card>
    )  
  }
  else{
    return (
      <Card className="w-96 flex flex-col">
        <CardHeader>
          <div className="flex gap-3 justify-between">
          <CardTitle>{title}</CardTitle>
          <p className="text-sm font-bold">{getTimestamp(date)}</p>
          </div>
        </CardHeader>
        <CardContent className="grow">
          <Image src={imageUrl} width={350} height={250} alt={title} />
          <CardDescription>{description}</CardDescription>
        </CardContent>
        <CardFooter className="flex justify-between">
          <p className="text-3xl">{value}</p>
          <Button>Ver más</Button>
        </CardFooter>
      </Card>
    )
  }
}

export default ArticleCard