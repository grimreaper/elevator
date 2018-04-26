class ManyThings {

  def bleh(a: Int): Int = {
    a * 5
  }
}

object ManyThings {

}


trait GenericMatchedID {
}


trait Providing extends GenericMatchedID {
  trait Providable {
  }

  trait Provider {

  }

}

object Providing {

}


trait Building extends GenericMatchedID{
  trait Builder {
  }

  trait Buidlable {
  }

  trait PartialBuilding extends GenericMatchedID{

    trait PartiallyBuildable {
    }

    trait PartialBuilder extends Builder {
    }

  }
}
