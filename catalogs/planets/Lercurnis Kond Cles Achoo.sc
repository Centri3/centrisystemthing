Moon	"Achoo/Lercurnis B VIII II"
{
	ParentBody     "Cles"
	Class          "Terra"
	Mass            0.2298
	Radius          4173.1
	InertiaMoment   0.32979
	Oblateness      0.0023172
	Obliquity       0.1
	EqAscendNode    68.702
	TidalLocked     true

	AlbedoBond      0.15
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Exotic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "lercurnis_kond_cles_achoo.cfg"
		SurfStyle       0.097384
		Randomize      (-0.884, 0.525, -0.235)
		colorDistMagn   0.08154
		colorDistFreq   600.66
		detailScale     128
		drivenDarkening 0
		seaLevel        0.35115
		snowLevel       0.9
		tropicLatitude  0.68214
		icecapLatitude  2
		icecapHeight    0.73352
		climatePole     1
		climateTropic   0.76336
		climateEquator  0.70229
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin 0.85
		climateForestMax 1
		climateGrassMin  -1
		climateGrassMax  0.85
		humidity        0.67176
		heightTempGrad  0.35878
		beachWidth      0.002
		tropicWidth     1
		mainFreq        0.57252
		venusFreq       1.1756
		venusMagn       0.83969
		mareFreq        0.88302
		mareDensity     0
		terraceProb     0.23505
		erosion         0.80916
		montesMagn      1
		montesFreq      25
		montesSpiky     0.81679
		montesFraction  1
		dunesMagn       0.073925
		dunesFreq       31.17
		dunesFraction   0.42852
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      25
		riversFreq      10
		riversSin       5.6489
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		canyonsMagn     0.06663
		canyonsFreq     116.01
		canyonsFraction 0
		cracksMagn      0.12563
		cracksFreq      0.42008
		cracksOctaves   0
		craterMagn      3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.68148
		volcanoFreq     0.77557
		volcanoDensity  0.23924
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.20508
		volcanoRadius   0.56252
		volcanoTemp     338.11
		lavaCoverTidal  0.36641
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.9002
		cycloneFreq     0.68341
		cycloneDensity  0.29936
		cycloneOctaves  0
		BumpHeight      22
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      1.9837
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.62215
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.777 1.000 0.979)
		ModulateBright  1
		Opacity         0.39695
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
        TempMapMaxTemp  67000
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.85369
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.766 0.808 1.000)
		ModulateBright  1
		Opacity         0.33588
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
        TempMapMaxTemp  67000
	}

	Clouds
	{
		Height          11.922
		Velocity        203.4
		BumpHeight      0.45341
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateColor  (0.578 0.871 1.000)
		ModulateBright  1
		Opacity         0.35115
		mainFreq        1.4198
		mainOctaves     0
		Coverage        0.64122
		stripeZones     1
		stripeTwist     3.5
        TempMapMaxTemp  67000
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Cles Achoo"
		Height          120
		Density         3615.3
		Pressure        1500
		Greenhouse      700
		Bright          7
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	67.21
			N2        	31.532
			SO2       	1.2499
			CO        	0.0079456
			Ar        	1.1561e-05
		}
	}

	Aurora
	{
		Height         100
		NorthLat       90
		NorthLon       0
		NorthRadius    2185.2
		NorthWidth     2052.5
		NorthRings     10
		NorthBright    0.3
		NorthFlashFreq 61.028
		NorthMoveSpeed 1.1181
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    2185.2
		SouthWidth     1962.6
		SouthRings     10
		SouthBright    0.3
		SouthFlashFreq 73.92
		SouthMoveSpeed 0.80588
		SouthParticles 100000
		TopColor    (0.621 0.371 0.611)
		BottomColor (0.349 0.324 0.652)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.32053953
		SemiMajorAxisKm 535421.624
		Eccentricity    0.01
		Inclination     0.1
		AscendingNode   68.7022901
		ArgOfPericenter -272.061069
		MeanAnomaly     0
	}
}

