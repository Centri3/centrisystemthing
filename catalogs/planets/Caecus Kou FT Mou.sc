DwarfPlanet	"Mou/Caecus I.FT1"
{
	ParentBody     "Caecus system bar"
	Class          "Ferria"
	Mass            0.00024604
	Radius          336.01
	InertiaMoment   0.39966
	Obliquity       0.74809
	EqAscendNode    -35.725
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Interior
	{
		Composition
		{
			Metals		100
		}
	}

	Surface
	{
		Preset         "caecus_kou_ft_mou.cfg"
		SurfStyle       0.96129
		Randomize      (-0.183, -0.955, 0.931)
		colorDistMagn   0.061175
		colorDistFreq   41.542
		detailScale     128
		drivenDarkening 0.19084
		seaLevel        0.25954
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.77863
		icecapHeight    0.031564
		climatePole     1
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.20392
		heightTempGrad  0.625
		beachWidth      0.00068671
		tropicWidth     0.061069
		mainFreq        1.6031
		venusFreq       1.2061
		venusMagn       1.374
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.19141
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.028092
		dunesFreq       3.6015
		dunesFraction   0.94596
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      63.203
		riversFreq      2.5515
		riversSin       6.4866
		riftsMagn       9.1603
		riftsFreq       3.2689
		riftsSin        7.4274
		eqridgeMagn     0.41985
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  4.1221
		canyonsMagn     0.72815
		canyonsFreq     0.10113
		canyonsFraction 0.2313
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   16
		craterRayedFactor 0
		volcanoMagn     0.30534
		volcanoFreq     0.77863
		volcanoDensity  0.28244
		volcanoOctaves  4
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.80153
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      15
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          2.72897324
		SemiMajorAxis   1.6000001
		Eccentricity    0.0458015267
		Inclination     0.7480916
		AscendingNode   -35.7251908
		ArgOfPericenter -57.7099237
		MeanAnomaly     -60
	}
}

