package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.extensions.toEntity
import br.com.alura.musicasBD.extensions.toModel
import br.com.alura.musicasBD.modelos.Banda
import javax.persistence.EntityManager

class BandaDAO(manager: EntityManager)
    : DAO<Banda, BandaEntity>(manager, BandaEntity::class.java)
    {
        override fun toEntity(model: Banda): BandaEntity {
            return model.toEntity()
        }

        override fun toModel(entity: BandaEntity): Banda {
            return entity.toModel()
        }
}